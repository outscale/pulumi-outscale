examples info:

OS test table:

|Example | OS| State |
|--------|---|-------|
|python|Arch Linux|OK|
|yaml|Arch Linux|OK (require yaml plugin on AUR)| 
|python|Mac OS ARM|OK| 
|yaml|Mac OS ARM|KO (segfaul)|


for Arch Linux yaml, you need to install this: https://aur.archlinux.org/packages/pulumi-language-yaml
```sh
yay -S pulumi-language-yaml
```
