"""Generate cloudinit.yaml."""
from jinja2 import Template

PRIVATE_KEY = open('snake-ssh', 'r').read()
PUBLIC_KEY = open('snake-ssh.pub', 'r').read()

TEMPLATE = """#cloud-config

ssh_keys:
  rsa_private: | 
{{private_key | indent(4, True) }}
  rsa_public: {{ public_key }}
"""

DATA = {
    "private_key":  PRIVATE_KEY,
    "public_key": PUBLIC_KEY,
}

J2_TEMPLATE = Template(TEMPLATE)
FILE = open("cloudinit.yaml", "a")
FILE.write(J2_TEMPLATE.render(DATA))
FILE.close()
