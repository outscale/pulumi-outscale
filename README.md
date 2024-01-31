# Outscale Resource Provider
[![Project Sandbox](https://docs.outscale.com/fr/userguide/_images/Project-Sandbox-yellow.svg)](https://docs.outscale.com/en/userguide/Open-Source-Projects.html)

The Outscale Resource Provider lets you manage [Outscale](https://fr.outscale.com/api-outscale/) resources.

## Work In Progress

This project is still very unstable, use it at your own risk

## Usage

This package is available for several languages/platforms:

### yaml

[Examples here](https://github.com/outscale/pulumi-outscale/tree/master/examples/yaml)

### Node.js (JavaScript/TypeScript)

[Examples here](https://github.com/outscale/pulumi-outscale/tree/master/examples/ts)


### Python

[Examples here](https://github.com/outscale/pulumi-outscale/tree/master/examples/python)


### Go

__Not yet tested, and posibly broken__


### .NET

__Not yet tested, and posibly broken__

### .Java

__Not yet tested, and posibly broken__


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




