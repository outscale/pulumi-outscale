# Deploy Snake to Outscale using Pulumi and Ansible

This project will deploy the game snake using pulumi and ansible.
## Prerequisites

* [Install Pulumi](https://www.pulumi.com/docs/get-started/install/)
* [Install Ansible](https://docs.ansible.com/ansible/latest/installation_guide/intro_installation.html)

## Deploying Your Infrastructure
0. Install pulumi outscale python sdk:
   ```bash
   pip install virtualenv
   python3 -m venv venv
   source venv/bin/activate
   pip install -r requirements.txt 
   pip3 install -e ../../../sdk/python/
   ```

1. Create a new stack for this example:

    ```bash
    $ pulumi stack init snake
    ```

2. Generate a key pair which will be used to access your outscale vm over SSH:

    ```bash
    $ ssh-keygen -t rsa -b 4096 -f snake-keypair
    ```

   This will create two files: your private (`snake-keypair`) and your public (`snake-keypair.pub`)
   keys.

3. Generate a key pair which will be used to access your outscale vm over SSH:

    ```bash
    $ ssh-keygen -t ed25519 -f snake-ssh
    ```

   This will create two files: your private (`snake-ssh`) and your public (`snake-ssh.pub`)
   keys.


3. Generate a key pair which will be used to access your outscale vm over SSH:

    ```bash
    $ ssh-keygen -t ed25519 -f snake-ssh
    ```
4. Generate cloudinit.yaml

    ```bash
    $ python3 cloudinit.py 
    ```


5. Set the required configuration variables with your own region and ak/sk:

    ```bash
    $ pulumi config set outscale:region eu-west-2 # any valid Outscale region
    $ pulumi config set outscale:accessKeyId accessKey # your accessKey
    $ pulumi config set outscale:secretKeyId secretKey --secret # your secretKey
    $ pulumi config set snake:user outscale # your os user 
    $ pulumi config set snake:publicKeyPath snake-keypair.pub # your newly generated public key
    $ pulumi config set snake:privateKeyPath snake-keypair # your newly generated private key
    $ pulumi config set snake:vmType tinav6.c4r8p2 # vmType you choose for your vm
    $ pulumi config set snake:linuxOmi ami-cd8d714e # ubuntu omi you choose for your vm
    ```

6. Now all you need to do is run `pulumi up`. 


7. You will get the url output:

    ```bash
    $ pulumi stack output url
    http://80.247.6.235:8080
    ```

8. For any changes in snake infrastructure please do 'pulumi up'.

9. After you're done, you will destroy your stack:

    ```bash
    $ pulumi destroy
    $ pulumi stack rm snake
    ```