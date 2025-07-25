#!/bin/bash

# Copyright (c) Outscale SAS
#
# SPDX-License-Identifier: BSD-3-Clause

set -e

# --- Environment setup ---
export OSC_PASSWORD='ashita wa dochida'
export OSC_LOGIN=joe
export OMI_ID="ami-90067666"
export OSC_SECRET_KEY=0000001111112222223333334444445555555666
export OSC_ACCESS_KEY=11112211111110000000
export OSC_USING_RICOCHET="oui"
export ROOT=$PWD
export GOPATH=$PWD
export PULUMI_CONFIG_PASSPHRASE=wololo
export PATH=$PATH:$HOME/.pulumi/bin

MSG_BASE="Test"
PULUMICTL_VERSION=v0.0.32

# --- Helper functions ---
function pulumi_up_down() {
    set -eE
    trap "echo [$MSG_BASE $1 pulumi up FAIL]" ERR
    PATH=$PATH:$GOPATH/bin pulumi up --yes
    echo "[$MSG_BASE $1 pulumi up OK]"
    trap "echo [$MSG_BASE $1 pulumi down FAIL]" ERR
    PATH=$PATH:$GOPATH/bin pulumi down --yes
    echo "[$MSG_BASE $1 pulumi down OK]"
    set -e
}

function pulumi_setup_local() {
    echo "pulumi set all stuffs"
    pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
    pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
    pulumi config set outscale:region "eu-west-2"
    pulumi config set outscale:insecure true
    pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'
}

function pulumi_setup_state() {
  pulumi stack rm -fy staging || true
  set +e
  echo "pulumi stack init staging"
  pulumi stack init staging
  pulumi stack select staging
  set -e
}

# --- Language-specific test functions ---

function test_yaml() {
    echo "--- Testing YAML ---"
    cd examples/yaml

    pulumi_setup_state
    pulumi_setup_local
    pulumi_up_down "yaml"

    cd "$ROOT"
}

function test_dotnet() {
    echo "--- Testing Dotnet ---"
    cd examples/dotnet/user/

    pulumi_setup_state
    pulumi_setup_local
    dotnet nuget add source "$ROOT/sdk/dotnet/bin/Debug/" --name "$ROOT/sdk/dotnet/bin/Debug/"
    pulumi_up_down "dotnet"

    dotnet nuget remove source "$ROOT/sdk/dotnet/bin/Debug/"

    cd "$ROOT"
}

function test_python() {
    echo "--- Testing Python ---"
    cd examples/python/user/

    python3 -m venv venv
    source venv/bin/activate
    pip install setuptools
    pip install pulumi_cloudinit
    pip install "$GOPATH/sdk/python/"

    pulumi_setup_state
    pulumi_setup_local
    pip freeze
    pulumi_up_down "python user"
    deactivate

    cd ../hello/

    python3 -m venv venv
    source venv/bin/activate
    pip install setuptools
    pip install pulumi_cloudinit
    pip install "$GOPATH/sdk/python/"

    pulumi_setup_state
    pulumi_setup_local
    pip freeze
    pulumi_up_down "python hello"
    deactivate

    cd "$ROOT"
}

function test_nodejs() {
    echo "--- Testing NodeJS ---"
    cd examples/ts/user/

    npm install "$GOPATH/sdk/nodejs/bin"

    pulumi_setup_state
    pulumi_setup_local
    pulumi_up_down "ty/js user"

    cd "$ROOT"
}

function test_go() {
    echo "--- Testing Go ---"
    cd examples/go/vm/

    pulumi_setup_state
    pulumi_setup_local
    pulumi_up_down "go/vm"

    cd "$ROOT"
}

# --- Setup ---
echo "--- Setting up ricochet ---"
if [ ! -d "osc-ricochet-2" ]; then
    git clone https://github.com/outscale/osc-ricochet-2
fi
cd osc-ricochet-2
pkill ricochet || true
cargo build --profile 'sdks'
./mk_cert.sh
cargo run --profile 'sdks' -- ./ricochet-ssl.json &> /dev/null &
cd "$ROOT"
sleep 5

echo "--- Setting up Pulumi ---"
make .pulumi/bin/pulumi
# if [ ! -d "$HOME/.pulumi/bin" ]; then
#     mkdir -p "$HOME/.pulumi/bin"
# fi
# cd "$HOME/.pulumi/bin"
# if [ ! -f "pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz" ]; then
#     wget https://github.com/pulumi/pulumictl/releases/download/$PULUMICTL_VERSION/pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz
# fi
# tar -xvf pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz > /dev/null
cd "$ROOT"

echo "--- Building Provider ---"
make build

# without that I have dependencies errors.
rm -rvf ~/.nuget || true

echo "pulumi login --local"
pulumi login --local

# --- Main execution logic ---
if [ -z "$1" ]; then
    echo "--- Running all tests ---"
    test_yaml
    test_dotnet
    test_python
    test_nodejs
    test_go
else
    echo "--- Running test for $1 ---"
    case "$1" in
        dotnet) test_dotnet ;;
        go) test_go ;;
        nodejs) test_nodejs ;;
        python) test_python ;;
        yaml) test_yaml ;;
        *)
            echo "Error: Unknown language '$1'"
            exit 1
            ;;
    esac
fi

pkill ricochet || true
