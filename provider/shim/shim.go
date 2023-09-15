package shim

import (
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	outscale "github.com/outscale/terraform-provider-outscale/outscale"
)

func NewProvider() terraform.ResourceProvider {
	prov := outscale.Provider

	return prov()
}
