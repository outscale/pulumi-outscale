#!/bin/bash

# Copyright (c) Outscale SAS
#
# SPDX-License-Identifier: BSD-3-Clause

export OSC_PASSWORD='ashita wa dochida'
export OSC_LOGIN=joe

export OMI_ID="ami-90067666"

export OSC_SECRET_KEY=0000001111112222223333334444445555555666
export OSC_ACCESS_KEY=11112211111110000000

export OSC_USING_RICOCHET="oui"


if [ "$#" -eq 0 ]; then

    if [ ! -d "osc-ricochet-2" ]; then
	git clone https://github.com/outscale/osc-ricochet-2
    fi

    cd osc-ricochet-2
    pkill ricochet

    cargo build --profile 'sdks'
    ./mk_cert.sh
    cargo run --profile 'sdks' -- ./ricochet-ssl.json &> /dev/null  &
    cd ..

    sleep 5
fi

set -e

export GOPATH=$PWD

if [ "$#" -eq 0 ]; then
    export PATH=$PATH:$HOME/.pulumi/bin
fi
# a strong password is important
export PULUMI_CONFIG_PASSPHRASE=wololo

MSG_BASE="Test"
PULUMICTL_VERSION=v0.0.32

if [ "$#" -eq 0 ]; then
    cd $HOME/.pulumi/bin
    wget https://github.com/pulumi/pulumictl/releases/download/$PULUMICTL_VERSION/pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz
    tar -xvf pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz
    cd -
fi

echo "BUILD provider and build_python"
make provider build_python build_nodejs build_dotnet

echo "pulumi login --local"
pulumi login --local

echo "cd examples/yaml"
cd examples/yaml
set +e
echo "pulumi stack init staging"
pulumi stack init staging
pulumi stack select staging
set -e

echo "pulumi set all stuffs"
pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

set -eE

trap "echo [$MSG_BASE yaml pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE yaml pulumi up OK]"
trap "echo [$MSG_BASE yaml pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE yaml pulumi down OK]"

set -e

echo "../dotnet/"
cd ../dotnet/


cd user/

nuget add  ../../../sdk/dotnet/bin/Debug/Pulumi.Outscale.0.0.1-alpha.1712846498.nupkg -Source .

set +e
echo "pulumi stack init staging"
pulumi stack init staging
pulumi stack select staging
set -e

pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

set -eE

trap "echo [$MSG_BASE ty/js user pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE ty/js user pulumi up OK]"
trap "echo [$MSG_BASE ty/js user pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE ty/js user pulumi down OK]"

set -e

echo "../python/"
cd ../python/

# because I use outscale-pulumi as go path, I can use it here too

cd user/

python -m venv venv
source venv/bin/activate

pip install pulumi_cloudinit
pip install $GOPATH/sdk/python/

set +e
echo "pulumi stack init staging"
pulumi stack init staging
pulumi stack select staging
set -e

pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

pip freeze

set -eE

trap "echo [$MSG_BASE python user pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE python user pulumi up OK]"
trap "echo [$MSG_BASE python user pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE python user pulumi down OK]"

set -e
deactivate

cd ../hello/

python -m venv venv
source venv/bin/activate

pip install pulumi_cloudinit
pip install $GOPATH/sdk/python/

set +e
echo "pulumi stack init staging"
pulumi stack init staging
pulumi stack select staging
set -e

pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

pip freeze

set -eE

trap "echo [$MSG_BASE python hello pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE python hello pulumi up OK]"
trap "echo [$MSG_BASE python hello pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE python hello pulumi down OK]"

set +e
set -e

echo "../../ts/user/"
cd ../../ts/user/

set +e
echo "pulumi stack init staging"
pulumi stack init staging
pulumi stack select staging
set -e

npm install $GOPATH/sdk/nodejs/bin

pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

set -eE

trap "echo [$MSG_BASE ty/js user pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE ty/js user pulumi up OK]"
trap "echo [$MSG_BASE ty/js user pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE ty/js user pulumi down OK]"
