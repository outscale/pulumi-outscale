## installation

The Pulumi OUTSCALE provider is available as a package in all Pulumi languages:

 * Go: github.com/outscale/pulumi-outscale/sdk/go/outscale


## Configuration

The following configuration points are available for the `OUTSCALE` provider:

- `outscale:region` - (Required) This is the OSC region.

- `outscale:accessKeyId` - (Require) This is the OSC access key. It can also be sourced from the
  `OSC_ACCESS_KEY` environment variable.
- `outscale:secretKeyId` - (Require) This is the OSC secret key. It can also be sourced from the
  `OSC_SECRET_KEY` environment variable.
- `outscale:insecure` - (Optional) If set to true, allow pulumi to perform "insecure" SSL connections and transfers
- `outscale:endpoints` - (Optional) change the endpoints, examples `pulumi config set outscale:endpoints '[{"api": "127.0.0.1:3000"}]'`


# To start developping Pulumi Outscale
Please look at [Development](./docs/developement.md)

# Contribution
Please look at [Contribution](./docs/contributing.md)
