// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package outscale

import (
	"context"
	_ "embed"
	"fmt"
	"path/filepath"
	"strings"
	"unicode"

	"github.com/outscale/pulumi-outscale/provider/pkg/version"
	"github.com/outscale/terraform-provider-outscale/outscale"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"

	"github.com/hashicorp/terraform-plugin-framework/datasource"
	"github.com/hashicorp/terraform-plugin-framework/resource"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

//go:embed cmd/pulumi-resource-outscale/bridge-metadata.json
var metadata []byte

var endpointServiceNames []string

func init() {
	endpointServiceNames = []string{
		"api",
	}
}

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	outscalePkg = "outscale"
	// modules:
	outscaleMod = "index" // the outscale module
)

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

// outscaleMember manufactures a type token for the Scaleway package and the given module and type.
func outscaleMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(outscalePkg + ":" + mod + ":" + mem)
}

// outscaleType manufactures a type token for the Scaleway package and the given module and type.
func outscaleType(mod string, typ string) tokens.Type {
	return tokens.Type(outscaleMember(mod, typ))
}

// outscaleDataSource manufactures a standard resource token given a module and resource name.
// It automatically uses the Scaleway package and names the file by simply lower casing the data
// source's first character.
func outscaleDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return outscaleMember(mod+"/"+fn, res)
}

// outscaleResource manufactures a standard resource token given a module and resource name.
// It automatically uses the Scaleway package and names the file by simply lower casing the resource's
// first character.
func outscaleResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return outscaleType(mod+"/"+fn, res)
}

func refProviderLicense(license tfbridge.TFProviderLicense) *tfbridge.TFProviderLicense {
	return &license
}

func endpointsSchema() *schema.Schema {
	endpointsAttributes := make(map[string]*schema.Schema)

	for _, endpointServiceName := range endpointServiceNames {
		endpointsAttributes[endpointServiceName] = &schema.Schema{
			Type:        schema.TypeString,
			Optional:    true,
			Default:     "",
			Description: "Use this to override the default service endpoint URL",
		}
	}

	return &schema.Schema{
		Type:     schema.TypeSet,
		Optional: true,
		Elem: &schema.Resource{
			Schema: endpointsAttributes,
		},
	}
}

func providerConfigureClient(d *schema.ResourceData) (interface{}, error) {
	config := outscale.Config{
		Endpoints:    make(map[string]string),
		X509CertPath: d.Get("x509_cert_path").(string),
		X509KeyPath:  d.Get("x509_key_path").(string),
		Insecure:     d.Get("insecure").(bool),
	}

	if ak, ok := d.GetOk("access_key_id"); ok {
		config.AccessKeyID = ak.(string)
	}
	if sk, ok := d.GetOk("secret_key_id"); ok {
		config.SecretKeyID = sk.(string)
	}
	if region, ok := d.GetOk("region"); ok {
		config.Region = region.(string)
	}
	endpointsSet := d.Get("endpoints").(*schema.Set)

	for _, endpointsSetI := range endpointsSet.List() {
		endpoints := endpointsSetI.(map[string]interface{})
		config.Endpoints["api"] = endpoints["api"].(string)
	}

	return config.Client()
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	ctx := context.Background()

	tfFrameworkProvider := outscale.New(version.Version)

	tfOutscaleSchemaProvider := outscale.Provider()
	// Instantiate the Terraform provider
	outscaleSchemaProvider := &schema.Provider{
		Schema: map[string]*schema.Schema{
			"access_key_id": {
				Type:        schema.TypeString,
				Required:    true,
				DefaultFunc: schema.EnvDefaultFunc("OUTSCALE_ACCESSKEYID", nil),
				Description: "The Access Key ID for API operations",
			},
			"secret_key_id": {
				Type:        schema.TypeString,
				Required:    true,
				DefaultFunc: schema.EnvDefaultFunc("OUTSCALE_SECRETKEYID", nil),
				Description: "The Secret Key ID for API operations.",
			},
			"region": {
				Type:        schema.TypeString,
				Required:    true,
				DefaultFunc: schema.EnvDefaultFunc("OUTSCALE_REGION", nil),
				Description: "The Region for API operations.",
			},
			"x509_cert_path": {
				Type:        schema.TypeString,
				Optional:    true,
				DefaultFunc: schema.EnvDefaultFunc("OUTSCALE_X509CERT", nil),
				Description: "The path to your x509 cert",
			},
			"endpoints": endpointsSchema(),
			"x509_key_path": {
				Type:        schema.TypeString,
				Optional:    true,
				DefaultFunc: schema.EnvDefaultFunc("OUTSCALE_X509KEY", nil),
				Description: "The path to your x509 key",
			},
			"insecure": {
				Type:        schema.TypeBool,
				Optional:    true,
				Default:     false,
				Description: "tls insecure connection",
			},
		},

		ResourcesMap:   tfOutscaleSchemaProvider.ResourcesMap,
		DataSourcesMap: tfOutscaleSchemaProvider.DataSourcesMap,

		ConfigureFunc: providerConfigureClient,
	}

	resourceMap := make(map[string]*tfbridge.ResourceInfo)

	// outscale_api_access_policy => ApiAccessPolicy
	for resourceName := range outscaleSchemaProvider.ResourcesMap {
		resourceMap[resourceName] = &tfbridge.ResourceInfo{
			Tok: outscaleResource(outscaleMod, resourceNameToPulumiIdentifier(resourceName)),
		}
	}

	for _, ressourceFactory := range tfFrameworkProvider.Resources(context.Background()) {
		res := ressourceFactory()
		resp := resource.MetadataResponse{}
		res.Metadata(ctx, resource.MetadataRequest{
			ProviderTypeName: "outscale",
		}, &resp)
		resourceMap[resp.TypeName] = &tfbridge.ResourceInfo{
			Tok: outscaleResource(outscaleMod, resourceNameToPulumiIdentifier(resp.TypeName)),
		}
	}

	dsMap := make(map[string]*tfbridge.DataSourceInfo)
	// outscale_api_access_policy => getApiAccessPolicy
	for datasourceName := range outscaleSchemaProvider.DataSourcesMap {
		dsMap[datasourceName] = &tfbridge.DataSourceInfo{
			Tok: outscaleDataSource(outscaleMod, "get"+resourceNameToPulumiIdentifier(datasourceName)),
		}
	}

	for _, datasourceFactory := range tfFrameworkProvider.DataSources(context.Background()) {
		ds := datasourceFactory()
		resp := datasource.MetadataResponse{}
		ds.Metadata(ctx, datasource.MetadataRequest{
			ProviderTypeName: "outscale",
		}, &resp)
		dsMap[resp.TypeName] = &tfbridge.DataSourceInfo{
			Tok: outscaleDataSource(outscaleMod, "get"+resourceNameToPulumiIdentifier(resp.TypeName)),
		}
	}

	prov := tfbridge.ProviderInfo{
		P: pfbridge.MuxShimWithPF(context.Background(),
			shimv2.NewProvider(outscaleSchemaProvider),
			tfFrameworkProvider,
		),
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		Name:         "outscale",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Pulumi",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "",
		Description:       "A Pulumi package for creating and managing outscale cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "outscale", "category/cloud"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/outscale/pulumi-outscale",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "outscale",
		Config: map[string]*tfbridge.SchemaInfo{
			"access_key_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OUTSCALE_ACCESSKEYID"},
				},
			},
			"secret_key_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OUTSCALE_SECRETKEYID"},
				},
			},
			"region": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OUTSCALE_REGION"},
				},
			},
		},
		Resources:   resourceMap,
		DataSources: dsMap,
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@outscale/pulumi-outscale",
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/outscale/pulumi-%[1]s/sdk/", outscalePkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				outscalePkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	// These are new API's that you may opt to use to automatically compute resource tokens,
	// and apply auto aliasing for full backwards compatibility.
	// For more information, please reference: https://pkg.go.dev/github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge#ProviderInfo.ComputeTokens
	prov.SetAutonaming(255, "-")
	return prov
}

func resourceNameToPulumiIdentifier(resourceName string) string {
	components := strings.Split(resourceName, "_")
	if len(components) < 2 {
		panic(fmt.Sprintf("unexpected resource name %q", resourceName))
	}
	name := ""
	for _, component := range components {
		if len(component) == 0 {
			panic(fmt.Sprintf("unexpected empty component in resource name %q", resourceName))
		}
		name += string(unicode.ToUpper(rune(component[0]))) + component[1:]
	}
	return name
}
