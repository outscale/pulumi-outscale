```sh
pip install <PULUMI-OUTSCALE-PATH>/sdk/python/
pip install pulumi_cloudinit
PATH=$PATH:$GOPATH/bin pulumi up # this one will fail because ak/sk and region not configured
pulumi config set outscale:secretKeyId <SECRET_KEY> --secret
pulumi config set outscale:region eu-west-2
pulumi config set outscale:accessKeyId <ACCESS_KEY>
PATH=$PATH:$GOPATH/bin pulumi up
```
