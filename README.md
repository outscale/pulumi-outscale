# Outscale Resource Provider

The Outscale Resource Provider lets you manage [Outscale](https://fr.outscale.com/api-outscale/) resources.

## Work In Progress

This project is still very unstable, use it at your own risk

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @pulumi/outscale
```

or `yarn`:

```bash
yarn add @pulumi/outscale
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_outscale
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/outscale/pulumi-outscale/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.Outscale
```

## Configuration

The following configuration points are available for the `OUTSCALE` provider:

- `outscale:region` - (Required) This is the OSC region.

- `outscale:accessKeyId` - (Optional) This is the OSC access key. It can also be sourced from the
  `OSC_ACCESS_KEY` environment variable.
- `outscale:secretKeyId` - (Optional) This is the OSC secret key. It can also be sourced from the
  `OSC_SECRET_KEY` environment variable.

## Reference

For detailed reference documentation, please visit .


# To start developping Pulumi Outscale
Please look at [Development](./docs/developement.md)

# Contribution
Please look at [Contribution](./docs/contributing.md)




