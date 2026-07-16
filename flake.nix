{
  description = "Pulumi OUTSCALE provider development environment";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = {
    nixpkgs,
    flake-utils,
    ...
  }:
    flake-utils.lib.eachDefaultSystem (system: let
      pkgs = nixpkgs.legacyPackages.${system};
    in {
      devShells.default = pkgs.mkShellNoCC {
        name = "pulumi-outscale";

        packages = with pkgs; [
          gawk
          gh
          git
          gnumake
          mise
        ];

        shellHook = ''
          if [[ -x "$PWD/scripts/get-versions.sh" ]]; then
            eval "$("$PWD/scripts/get-versions.sh")"
            export GO_VERSION_MISE PULUMI_VERSION_MISE
          fi

          mise install -q
          eval "$(mise activate bash)"
        '';
      };
    });
}
