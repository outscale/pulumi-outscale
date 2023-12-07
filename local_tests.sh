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
	git clone https://github.com/outscale-mgo/osc-ricochet-2
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

#make example-node-create-volumes
export GOPATH=$PWD
export PATH=$PATH:$HOME/.pulumi/bin
# a strong password is important
export PULUMI_CONFIG_PASSPHRASE=wololo

PULUMICTL_VERSION=v0.0.32

cd $HOME/.pulumi/bin
wget https://github.com/pulumi/pulumictl/releases/download/$PULUMICTL_VERSION/pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz
tar -xvf pulumictl-${PULUMICTL_VERSION}-linux-amd64.tar.gz
cd -

make provider build_python
cd examples/yaml

pulumi login --local
pulumi stack init staging

pulumi config set outscale:secretKeyId $OSC_SECRET_KEY
pulumi config set outscale:accessKeyId $OSC_ACCESS_KEY
pulumi config set outscale:region "eu-west-2"
pulumi config set outscale:insecure true
pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'

set -eE

MSG_BASE="Test"

trap "echo [$MSG_BASE yaml pulumi up FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi up --yes
echo "[$MSG_BASE yaml pulumi up OK]"
trap "echo [$MSG_BASE yaml pulumi down FAIL]" ERR
PATH=$PATH:$GOPATH/bin pulumi down --yes
echo "[$MSG_BASE yaml pulumi down OK]"
#make example-node-volumes
