start pulumi in dotnet

install dotnet,
install nuget,
install aspnet

in example directory:

```sh
nuget add  ../../../sdk/dotnet/bin/Debug/Pulumi.Outscale.0.0.1-alpha.1712846498.nupkg -Source .
PATH=$PATH:$GOPATH/bin pulumi up # this one will fail because ak/sk and region not configured
pulumi config set outscale:secretKeyId <SECRET_KEY> --secret
pulumi config set outscale:region eu-west-2
pulumi config set outscale:accessKeyId <ACCESS_KEY>
PATH=$PATH:$GOPATH/bin pulumi up
```

Note for dotnet:
PublicIp field in PublicIp resource is replace by MyPublicIp.
Tag field in Tag resource is replace by MyTag.

This is due to name conflict in dotnet.
