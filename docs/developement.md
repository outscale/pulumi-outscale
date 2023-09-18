### Prerequisites

Ensure the following tools are installed and present in your `$PATH`:

- [`pulumictl`](https://github.com/pulumi/pulumictl#installation)
- [Go 1.17](https://golang.org/dl/) or 1.latest
- [NodeJS](https://nodejs.org/en/) 14.x.  We recommend using [nvm](https://github.com/nvm-sh/nvm) to manage NodeJS installations.
- [Yarn](https://yarnpkg.com/)
- [TypeScript](https://www.typescriptlang.org/)
- [Python](https://www.python.org/downloads/) (called as `python3`).  


## Building the Provider and SDKs

To build python provider

```bash
make build_python
```

To build typescript provider
```bash
make build_typescript
```

```text
    warning: please set version in typescript package.json 
```


