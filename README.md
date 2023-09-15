# Outscale Resource Provider

The Outscale Resource Provider lets you manage [Outscale](https://fr.outscale.com/api-outscale/) resources.

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @pulumi/foo
```

or `yarn`:

```bash
yarn add @pulumi/foo
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_foo
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/pulumi/pulumi-foo/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.Foo
```

## Configuration

The following configuration points are available for the `OUTSCALE` provider:

- `osc:region` - (Required) This is the OSC region.

- `osc:accessKey` - (Optional) This is the OSC access key. It can also be sourced from the
  `OSC_ACCESS_KEY` environment variable.
- `osc:secretKey` - (Optional) This is the OSC secret key. It can also be sourced from the
  `OSC_SECRET_KEY` environment variable.

## Reference

For detailed reference documentation, please visit .
