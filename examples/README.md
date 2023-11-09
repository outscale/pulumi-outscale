examples info:

OS test table:

|Example | OS| State |
|--------|---|-------|
|python|Arch Linux|OK|
|yaml|Arch Linux|OK (require yaml plugin on AUR)| 
|python|Ubuntu|OK|
|yaml|Ubuntu|OK|
|ts | Ubuntu| KO (import * as pulumi from "@pulumi/pulumi" SyntaxError: Cannot use import statement outside a module))|
|python|Mac OS ARM|OK| 
|yaml|Mac OS ARM|KO (segfaul)|


for Arch Linux yaml, you need to install this: https://aur.archlinux.org/packages/pulumi-language-yaml
```sh
yay -S pulumi-language-yaml
```
