
start pulumi in python:
```sh
source venv/bin/activate
pip install <PULUMI-OUTSCALE-PATH>/sdk/python/
pip install pulumi_cloudinit
PATH=$PATH:$GOPATH/bin pulumi up # this one will fail because ak/sk and region not configured
pulumi config set outscale:secretKeyId <SECRET_KEY> --secret
pulumi config set outscale:region eu-west-2
pulumi config set outscale:accessKeyId <ACCESS_KEY>
PATH=$PATH:$GOPATH/bin pulumi up
```

note venv directory name need to be the same as the one in Pulumi.yaml `virtualenv: venv`
if Pulumi.yaml contain `virtualenv: env`
then you need to source a direction call `env`
(`source env/bin/activate`)
