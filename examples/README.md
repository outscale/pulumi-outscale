# Readme for someone comming from terraform

## login localy

```sh
pulumi login -l
```

# ak/sk/region:
```
pulumi config set outscale:accessKeyId <MY_ACCESS_KEY>
pulumi config set outscale:secretKeyId <MY_SECRET_KEY> --secret
pulumi config set outscale:region eu-west-2
```