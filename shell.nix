{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = with pkgs; [
    # Go toolchain
    go
    gopls
    
    # .NET SDK for C# examples
    dotnet-sdk_8
    nuget
    
    # Node.js and package managers for TypeScript examples
    nodejs
    yarn
    
    # Python for Python examples
    python3
    python3Packages.pip
    python3Packages.virtualenv
    
    # Build tools
    gnumake
    
    # Pulumi (if you want it in the dev environment)
    # pulumi-bin
  ];

  shellHook = ''
    # .NET configuration
    export DOTNET_CLI_TELEMETRY_OPTOUT=1
    export DOTNET_SKIP_FIRST_TIME_EXPERIENCE=1
    export DOTNET_ROOT="${pkgs.dotnet-sdk_8}"
    export GO_VERSION_MISE="latest"
    export PULUMI_VERSION_MISE="latest"
    
    # Ensure Pulumi and its plugins are accessible
    export PATH="$HOME/.pulumi/bin:$PATH"
    
    # Fix TMPDIR issue
    unset TMPDIR
    
    echo "Development environment loaded:"
    echo "  - go $(go version | cut -d' ' -f3)"
    echo "  - dotnet $(dotnet --version)"
    echo "  - node $(node --version)"
    echo "  - yarn $(yarn --version)"
    echo "  - python $(python3 --version | cut -d' ' -f2)"
  '';
}
