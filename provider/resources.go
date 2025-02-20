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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/outscale/pulumi-outscale/provider/pkg/version"
	outscale "github.com/outscale/terraform-provider-outscale/outscale"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"

	//"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	//shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	//"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

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
		Endpoints:    make(map[string]interface{}),
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

		ResourcesMap: map[string]*schema.Resource{
			"outscale_vm":                                outscale.ResourceOutscaleVM(),
			"outscale_keypair":                           outscale.ResourceOutscaleKeyPair(),
			"outscale_image":                             outscale.ResourceOutscaleImage(),
			"outscale_internet_service_link":             outscale.ResourceOutscaleInternetServiceLink(),
			"outscale_internet_service":                  outscale.ResourceOutscaleInternetService(),
			"outscale_net":                               outscale.ResourceOutscaleNet(),
			"outscale_security_group":                    outscale.ResourceOutscaleSecurityGroup(),
			"outscale_outbound_rule":                     outscale.ResourceOutscaleOutboundRule(),
			"outscale_security_group_rule":               outscale.ResourceOutscaleOutboundRule(),
			"outscale_tag":                               outscale.ResourceOutscaleTags(),
			"outscale_public_ip":                         outscale.ResourceOutscalePublicIP(),
			"outscale_public_ip_link":                    outscale.ResourceOutscalePublicIPLink(),
			"outscale_volume":                            outscale.ResourceOutscaleVolume(),
			"outscale_volumes_link":                      outscale.ResourceOutscaleVolumeLink(),
			"outscale_net_attributes":                    outscale.ResourceOutscaleLinAttributes(),
			"outscale_nat_service":                       outscale.ResourceOutscaleNatService(),
			"outscale_subnet":                            outscale.ResourceOutscaleSubNet(),
			"outscale_route":                             outscale.ResourceOutscaleRoute(),
			"outscale_route_table":                       outscale.ResourceOutscaleRouteTable(),
			"outscale_route_table_link":                  outscale.ResourceOutscaleLinkRouteTable(),
			"outscale_nic":                               outscale.ResourceOutscaleNic(),
			"outscale_snapshot":                          outscale.ResourceOutscaleSnapshot(),
			"outscale_image_launch_permission":           outscale.ResourceOutscaleImageLaunchPermission(),
			"outscale_net_peering":                       outscale.ResourceOutscaleLinPeeringConnection(),
			"outscale_net_peering_acceptation":           outscale.ResourceOutscaleLinPeeringConnectionAccepter(),
			"outscale_net_access_point":                  outscale.ResourceOutscaleNetAccessPoint(),
			"outscale_nic_link":                          outscale.ResourceOutscaleNetworkInterfaceAttachment(),
			"outscale_nic_private_ip":                    outscale.ResourceOutscaleNetworkInterfacePrivateIP(),
			"outscale_snapshot_attributes":               outscale.ResourcedOutscaleSnapshotAttributes(),
			"outscale_dhcp_option":                       outscale.ResourceOutscaleDHCPOption(),
			"outscale_client_gateway":                    outscale.ResourceOutscaleClientGateway(),
			"outscale_virtual_gateway":                   outscale.ResourceOutscaleVirtualGateway(),
			"outscale_virtual_gateway_link":              outscale.ResourceOutscaleVirtualGatewayLink(),
			"outscale_virtual_gateway_route_propagation": outscale.ResourceOutscaleVirtualGatewayRoutePropagation(),
			"outscale_vpn_connection":                    outscale.ResourceOutscaleVPNConnection(),
			"outscale_vpn_connection_route":              outscale.ResourceOutscaleVPNConnectionRoute(),
			"outscale_access_key":                        outscale.ResourceOutscaleAccessKey(),
			"outscale_load_balancer":                     outscale.ResourceOutscaleLoadBalancer(),
			"outscale_load_balancer_policy":              outscale.ResourceOutscaleAppCookieStickinessPolicy(),
			"outscale_load_balancer_vms":                 outscale.ResourceLBUAttachment(),
			"outscale_load_balancer_attributes":          outscale.ResourceOutscaleLoadBalancerAttributes(),
			"outscale_flexible_gpu":                      outscale.ResourceOutscaleFlexibleGpu(),
			"outscale_flexible_gpu_link":                 outscale.ResourceOutscaleFlexibleGpuLink(),
			"outscale_image_export_task":                 outscale.ResourceOutscaleIMageExportTask(),
			"outscale_server_certificate":                outscale.ResourceOutscaleServerCertificate(),
			"outscale_snapshot_export_task":              outscale.ResourceOutscaleSnapshotExportTask(),
			"outscale_ca":                                outscale.ResourceOutscaleCa(),
			"outscale_api_access_rule":                   outscale.ResourceOutscaleApiAccessRule(),
			"outscale_api_access_policy":                 outscale.ResourceOutscaleApiAccessPolicy(),
		},
		DataSourcesMap: map[string]*schema.Resource{
			"outscale_vm":                        outscale.DataSourceOutscaleVM(),
			"outscale_vms":                       outscale.DataSourceOutscaleVMS(),
			"outscale_security_group":            outscale.DataSourceOutscaleSecurityGroup(),
			"outscale_security_groups":           outscale.DataSourceOutscaleSecurityGroups(),
			"outscale_image":                     outscale.DataSourceOutscaleImage(),
			"outscale_images":                    outscale.DataSourceOutscaleImages(),
			"outscale_tag":                       outscale.DataSourceOutscaleTag(),
			"outscale_public_ip":                 outscale.DataSourceOutscalePublicIP(),
			"outscale_public_ips":                outscale.DataSourceOutscalePublicIPS(),
			"outscale_volume":                    outscale.DataSourceOutscaleVolume(),
			"outscale_volumes":                   outscale.DataSourceOutscaleVolumes(),
			"outscale_nat_service":               outscale.DataSourceOutscaleNatService(),
			"outscale_nat_services":              outscale.DataSourceOutscaleNatServices(),
			"outscale_keypair":                   outscale.DataSourceOutscaleKeyPair(),
			"outscale_keypairs":                  outscale.DataSourceOutscaleKeyPairs(),
			"outscale_vm_state":                  outscale.DataSourceOutscaleVMState(),
			"outscale_vm_states":                 outscale.DataSourceOutscaleVMStates(),
			"outscale_internet_service":          outscale.DataSourceOutscaleInternetService(),
			"outscale_internet_services":         outscale.DataSourceOutscaleInternetServices(),
			"outscale_subnet":                    outscale.DataSourceOutscaleSubnet(),
			"outscale_subnets":                   outscale.DataSourceOutscaleSubnets(),
			"outscale_net":                       outscale.DataSourceOutscaleVpc(),
			"outscale_nets":                      outscale.DataSourceOutscaleVpcs(),
			"outscale_net_attributes":            outscale.DataSourceOutscaleVpcAttr(),
			"outscale_route_table":               outscale.DataSourceOutscaleRouteTable(),
			"outscale_route_tables":              outscale.DataSourceOutscaleRouteTables(),
			"outscale_snapshot":                  outscale.DataSourceOutscaleSnapshot(),
			"outscale_snapshots":                 outscale.DataSourceOutscaleSnapshots(),
			"outscale_net_peering":               outscale.DataSourceOutscaleLinPeeringConnection(),
			"outscale_net_peerings":              outscale.DataSourceOutscaleLinPeeringsConnection(),
			"outscale_nics":                      outscale.DataSourceOutscaleNics(),
			"outscale_nic":                       outscale.DataSourceOutscaleNic(),
			"outscale_client_gateway":            outscale.DataSourceOutscaleClientGateway(),
			"outscale_client_gateways":           outscale.DataSourceOutscaleClientGateways(),
			"outscale_virtual_gateway":           outscale.DataSourceOutscaleVirtualGateway(),
			"outscale_virtual_gateways":          outscale.DataSourceOutscaleVirtualGateways(),
			"outscale_vpn_connection":            outscale.DataSourceOutscaleVPNConnection(),
			"outscale_vpn_connections":           outscale.DataSourceOutscaleVPNConnections(),
			"outscale_access_key":                outscale.DataSourceOutscaleAccessKey(),
			"outscale_access_keys":               outscale.DataSourceOutscaleAccessKeys(),
			"outscale_dhcp_option":               outscale.DataSourceOutscaleDHCPOption(),
			"outscale_dhcp_options":              outscale.DataSourceOutscaleDHCPOptions(),
			"outscale_load_balancer":             outscale.DataSourceOutscaleLoadBalancer(),
			"outscale_load_balancer_tags":        outscale.DataSourceOutscaleLBUTags(),
			"outscale_load_balancer_vm_health":   outscale.DataSourceOutscaleLoadBalancerVmsHeals(),
			"outscale_load_balancers":            outscale.DataSourceOutscaleLoadBalancers(),
			"outscale_vm_types":                  outscale.DataSourceOutscaleVMTypes(),
			"outscale_net_access_point":          outscale.DataSourceOutscaleNetAccessPoint(),
			"outscale_net_access_points":         outscale.DataSourceOutscaleNetAccessPoints(),
			"outscale_flexible_gpu":              outscale.DataSourceOutscaleFlexibleGpu(),
			"outscale_flexible_gpus":             outscale.DataSourceOutscaleFlexibleGpus(),
			"outscale_subregions":                outscale.DataSourceOutscaleSubregions(),
			"outscale_regions":                   outscale.DataSourceOutscaleRegions(),
			"outscale_net_access_point_services": outscale.DataSourceOutscaleNetAccessPointServices(),
			"outscale_flexible_gpu_catalog":      outscale.DataSourceOutscaleFlexibleGpuCatalog(),
			"outscale_product_type":              outscale.DataSourceOutscaleProductType(),
			"outscale_product_types":             outscale.DataSourceOutscaleProductTypes(),
			"outscale_quota":                     outscale.DataSourceOutscaleQuota(),
			"outscale_quotas":                    outscale.DataSourceOutscaleQuotas(),
			"outscale_image_export_task":         outscale.DataSourceOutscaleImageExportTask(),
			"outscale_image_export_tasks":        outscale.DataSourceOutscaleImageExportTasks(),
			"outscale_server_certificate":        outscale.DataSourceOutscaleServerCertificate(),
			"outscale_server_certificates":       outscale.DataSourceOutscaleServerCertificates(),
			"outscale_snapshot_export_task":      outscale.DataSourceOutscaleSnapshotExportTask(),
			"outscale_snapshot_export_tasks":     outscale.DataSourceOutscaleSnapshotExportTasks(),
			"outscale_ca":                        outscale.DataSourceOutscaleCa(),
			"outscale_cas":                       outscale.DataSourceOutscaleCas(),
			"outscale_api_access_rule":           outscale.DataSourceOutscaleApiAccessRule(),
			"outscale_api_access_rules":          outscale.DataSourceOutscaleApiAccessRules(),
			"outscale_api_access_policy":         outscale.DataSourceOutscaleApiAccessPolicy(),
			"outscale_public_catalog":            outscale.DataSourceOutscalePublicCatalog(),
			"outscale_account":                   outscale.DataSourceAccount(),
			"outscale_accounts":                  outscale.DataSourceAccounts(),
		},

		ConfigureFunc: providerConfigureClient,
	}

	prov := tfbridge.ProviderInfo{

		P:    shimv2.NewProvider(outscaleSchemaProvider),
		Name: "outscale",
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

		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. Two examples
			// are below - the single line form is the common case. The multi-line form is
			// needed only if you wish to override types or other default options.
			//
			"outscale_access_key": {
				Tok: outscaleResource(outscaleMod, "AccessKey"),
				Docs: &tfbridge.DocInfo{
					Source: "access_key.md",
				},
			},
			"outscale_api_access_policy":                 {Tok: outscaleResource(outscaleMod, "ApiAccessPolicy")},
			"outscale_api_access_rule":                   {Tok: outscaleResource(outscaleMod, "ApiAccessRule")},
			"outscale_ca":                                {Tok: outscaleResource(outscaleMod, "Ca")},
			"outscale_client_gateway":                    {Tok: outscaleResource(outscaleMod, "ClientGateway")},
			"outscale_dhcp_option":                       {Tok: outscaleResource(outscaleMod, "DhcpOption")},
			"outscale_flexible_gpu":                      {Tok: outscaleResource(outscaleMod, "FlexibleGpu")},
			"outscale_flexible_gpu_link":                 {Tok: outscaleResource(outscaleMod, "FlexibleGpuLink")},
			"outscale_image":                             {Tok: outscaleResource(outscaleMod, "Image")},
			"outscale_image_export_task":                 {Tok: outscaleResource(outscaleMod, "ImageExportTask")},
			"outscale_image_launch_permission":           {Tok: outscaleResource(outscaleMod, "ImageLaunchPermission")},
			"outscale_internet_service":                  {Tok: outscaleResource(outscaleMod, "InternetService")},
			"outscale_internet_service_link":             {Tok: outscaleResource(outscaleMod, "InternetServiceLink")},
			"outscale_keypair":                           {Tok: outscaleResource(outscaleMod, "Keypair")},
			"outscale_load_balancer":                     {Tok: outscaleResource(outscaleMod, "LoadBalancer")},
			"outscale_load_balancer_attributes":          {Tok: outscaleResource(outscaleMod, "LoadBalancerAttributes")},
			"outscale_load_balancer_policy":              {Tok: outscaleResource(outscaleMod, "LoadBalancerPolicy")},
			"outscale_load_balancer_vms":                 {Tok: outscaleResource(outscaleMod, "LoadBalancerVms")},
			"outscale_nat_service":                       {Tok: outscaleResource(outscaleMod, "NatService")},
			"outscale_net":                               {Tok: outscaleResource(outscaleMod, "Net")},
			"outscale_net_access_point":                  {Tok: outscaleResource(outscaleMod, "NetAccessPoint")},
			"outscale_net_attributes":                    {Tok: outscaleResource(outscaleMod, "NetAttributes")},
			"outscale_net_peering":                       {Tok: outscaleResource(outscaleMod, "NetPeering")},
			"outscale_net_peering_acceptation":           {Tok: outscaleResource(outscaleMod, "NetPeeringAcception")},
			"outscale_nic":                               {Tok: outscaleResource(outscaleMod, "Nic")},
			"outscale_nic_link":                          {Tok: outscaleResource(outscaleMod, "NicLink")},
			"outscale_nic_private_ip":                    {Tok: outscaleResource(outscaleMod, "NicPrivateIp")},
			"outscale_outbound_rule":                     {Tok: outscaleResource(outscaleMod, "OutboundRule")},
			"outscale_public_ip":                         {Tok: outscaleResource(outscaleMod, "PublicIp")},
			"outscale_public_ip_link":                    {Tok: outscaleResource(outscaleMod, "PublicIpLink")},
			"outscale_route":                             {Tok: outscaleResource(outscaleMod, "Route")},
			"outscale_route_table":                       {Tok: outscaleResource(outscaleMod, "RouteTable")},
			"outscale_route_table_link":                  {Tok: outscaleResource(outscaleMod, "RouteTableLink")},
			"outscale_security_group":                    {Tok: outscaleResource(outscaleMod, "SecurityGroup")},
			"outscale_security_group_rule":               {Tok: outscaleResource(outscaleMod, "SecurityGroupRule")},
			"outscale_server_certificate":                {Tok: outscaleResource(outscaleMod, "ServerCertificate")},
			"outscale_snapshot":                          {Tok: outscaleResource(outscaleMod, "Snapshot")},
			"outscale_snapshot_attributes":               {Tok: outscaleResource(outscaleMod, "SnapshotAttributes")},
			"outscale_snapshot_export_task":              {Tok: outscaleResource(outscaleMod, "SnapshotExportTask")},
			"outscale_subnet":                            {Tok: outscaleResource(outscaleMod, "Subnet")},
			"outscale_tag":                               {Tok: outscaleResource(outscaleMod, "Tag")},
			"outscale_virtual_gateway":                   {Tok: outscaleResource(outscaleMod, "VirtualGateway")},
			"outscale_virtual_gateway_link":              {Tok: outscaleResource(outscaleMod, "VirtualGatewayLink")},
			"outscale_virtual_gateway_route_propagation": {Tok: outscaleResource(outscaleMod, "VirtualGatewayRoutePropagation")},
			"outscale_vm":                                {Tok: outscaleResource(outscaleMod, "Vm")},
			"outscale_volume":                            {Tok: outscaleResource(outscaleMod, "Volume")},
			"outscale_volumes_link":                      {Tok: outscaleResource(outscaleMod, "VolumesLink")},
			"outscale_vpn_connection":                    {Tok: outscaleResource(outscaleMod, "VpnConnection")},
			"outscale_vpn_connection_route":              {Tok: outscaleResource(outscaleMod, "VpnConnectionRoute")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Map each resource in the Terraform provider to a Pulumi function. An example
			// is below.
			// "aws_ami": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAmi")},
			"outscale_access_key":        {Tok: outscaleDataSource(outscaleMod, "getAccessKey")},
			"outscale_access_keys":       {Tok: outscaleDataSource(outscaleMod, "getAccessKeys")},
			"outscale_account":           {Tok: outscaleDataSource(outscaleMod, "getAccount")},
			"outscale_accounts":          {Tok: outscaleDataSource(outscaleMod, "getAccounts")},
			"outscale_api_access_policy": {Tok: outscaleDataSource(outscaleMod, "getApiAccessPolicy")},
			"outscale_api_access_rule":   {Tok: outscaleDataSource(outscaleMod, "getApiAccessRule")},
			"outscale_api_access_rules":  {Tok: outscaleDataSource(outscaleMod, "getApiAccessRules")},
			"outscale_ca":                {Tok: outscaleDataSource(outscaleMod, "getCa")},
			"outscale_cas":               {Tok: outscaleDataSource(outscaleMod, "getCas")},
			"outscale_client_gateway":    {Tok: outscaleDataSource(outscaleMod, "getClientGateway")},
			"outscale_client_gateways":   {Tok: outscaleDataSource(outscaleMod, "getClientGateways")},
			"outscale_dhcp_option":       {Tok: outscaleDataSource(outscaleMod, "getDhcpOption")},
			"outscale_dhcp_options":      {Tok: outscaleDataSource(outscaleMod, "getDhcpOptions")},
			"outscale_flexible_gpu":      {Tok: outscaleDataSource(outscaleMod, "getFlexibleGpu")},
			"outscale_flexible_gpus":     {Tok: outscaleDataSource(outscaleMod, "getFlexibleGpus")},

			"outscale_flexible_gpu_catalog":      {Tok: outscaleDataSource(outscaleMod, "getFlexibleGpuCatalog")},
			"outscale_image":                     {Tok: outscaleDataSource(outscaleMod, "getImage")},
			"outscale_images":                    {Tok: outscaleDataSource(outscaleMod, "getImages")},
			"outscale_image_export_task":         {Tok: outscaleDataSource(outscaleMod, "getImageExportTask")},
			"outscale_image_export_tasks":        {Tok: outscaleDataSource(outscaleMod, "getImageExportTasks")},
			"outscale_image_launch_permission":   {Tok: outscaleDataSource(outscaleMod, "getImageLaunchPermission")},
			"outscale_internet_service":          {Tok: outscaleDataSource(outscaleMod, "getInternetService")},
			"outscale_internet_services":         {Tok: outscaleDataSource(outscaleMod, "getInternetServices")},
			"outscale_internet_service_link":     {Tok: outscaleDataSource(outscaleMod, "getInternetServiceLink")},
			"outscale_keypair":                   {Tok: outscaleDataSource(outscaleMod, "getKeypair")},
			"outscale_keypairs":                  {Tok: outscaleDataSource(outscaleMod, "getKeypairs")},
			"outscale_load_balancer":             {Tok: outscaleDataSource(outscaleMod, "getLoadBalancer")},
			"outscale_load_balancer_tags":        {Tok: outscaleDataSource(outscaleMod, "getLoadBalancerTags")},
			"outscale_load_balancers":            {Tok: outscaleDataSource(outscaleMod, "getLoadBalancers")},
			"outscale_load_balancer_attributes":  {Tok: outscaleDataSource(outscaleMod, "getLoadBalancerAttributes")},
			"outscale_load_balancer_vms":         {Tok: outscaleDataSource(outscaleMod, "getLoadBalancerVms")},
			"outscale_load_balancer_vm_health":   {Tok: outscaleDataSource(outscaleMod, "getLoadBalancerVmHealth")},
			"outscale_nat_service":               {Tok: outscaleDataSource(outscaleMod, "getNatService")},
			"outscale_nat_services":              {Tok: outscaleDataSource(outscaleMod, "getNatServices")},
			"outscale_net":                       {Tok: outscaleDataSource(outscaleMod, "getNet")},
			"outscale_nets":                      {Tok: outscaleDataSource(outscaleMod, "getNets")},
			"outscale_net_access_points":         {Tok: outscaleDataSource(outscaleMod, "getNetAccessPoints")},
			"outscale_net_access_point":          {Tok: outscaleDataSource(outscaleMod, "getNetAccessPoint")},
			"outscale_net_access_point_services": {Tok: outscaleDataSource(outscaleMod, "getNetAccessPointServices")},
			"outscale_net_attributes":            {Tok: outscaleDataSource(outscaleMod, "getNetAttributes")},
			"outscale_net_peering":               {Tok: outscaleDataSource(outscaleMod, "getNetPeering")},
			"outscale_net_peerings":              {Tok: outscaleDataSource(outscaleMod, "getNetPeerings")},
			"outscale_net_peering_acceptation":   {Tok: outscaleDataSource(outscaleMod, "getNetPeeringAcceptation")},
			"outscale_nic":                       {Tok: outscaleDataSource(outscaleMod, "getNic")},
			"outscale_nics":                      {Tok: outscaleDataSource(outscaleMod, "getNics")},
			"outscale_nic_link":                  {Tok: outscaleDataSource(outscaleMod, "getNicLink")},
			"outscale_nic_private_ip":            {Tok: outscaleDataSource(outscaleMod, "getNicPrivateIp")},
			"outscale_outbound_rule":             {Tok: outscaleDataSource(outscaleMod, "getOutboundRule")},
			"outscale_product_types":             {Tok: outscaleDataSource(outscaleMod, "getProductTypes")},
			"outscale_product_type":              {Tok: outscaleDataSource(outscaleMod, "getProductType")},
			"outscale_public_catalog":            {Tok: outscaleDataSource(outscaleMod, "getPulicCatalog")},
			"outscale_public_ip":                 {Tok: outscaleDataSource(outscaleMod, "getPublicIp")},
			"outscale_public_ips":                {Tok: outscaleDataSource(outscaleMod, "getPublicIps")},
			"outscale_public_ip_link":            {Tok: outscaleDataSource(outscaleMod, "getPublicIpLink")},
			"outscale_quota":                     {Tok: outscaleDataSource(outscaleMod, "getQuota")},
			"outscale_quotas":                    {Tok: outscaleDataSource(outscaleMod, "getQuotas")},
			"outscale_regions":                   {Tok: outscaleDataSource(outscaleMod, "getRegions")},
			"outscale_route":                     {Tok: outscaleDataSource(outscaleMod, "getRoute")},
			"outscale_route_table":               {Tok: outscaleDataSource(outscaleMod, "getRouteTable")},
			"outscale_route_tables":              {Tok: outscaleDataSource(outscaleMod, "getRouteTables")},
			"outscale_route_table_link":          {Tok: outscaleDataSource(outscaleMod, "getRouteTableLink")},
			"outscale_security_group":            {Tok: outscaleDataSource(outscaleMod, "getSecurityGroup")},
			"outscale_security_groups":           {Tok: outscaleDataSource(outscaleMod, "getSecurityGroups")},
			"outscale_security_group_rule":       {Tok: outscaleDataSource(outscaleMod, "getSecurityGroupRule")},
			"outscale_server_certificate":        {Tok: outscaleDataSource(outscaleMod, "getServerCertificate")},
			"outscale_server_certificates":       {Tok: outscaleDataSource(outscaleMod, "getServerCertificates")},
			"outscale_snapshot":                  {Tok: outscaleDataSource(outscaleMod, "getSnapshot")},
			"outscale_snapshots":                 {Tok: outscaleDataSource(outscaleMod, "getSnapshots")},
			"outscale_snapshot_export_task":      {Tok: outscaleDataSource(outscaleMod, "getSnapshotExportTask")},
			"outscale_snapshot_export_tasks":     {Tok: outscaleDataSource(outscaleMod, "getSnapshotExportTasks")},
			"outscale_snapshot_attributes":       {Tok: outscaleDataSource(outscaleMod, "getSnapshotAttributes")},
			"outscale_subnet":                    {Tok: outscaleDataSource(outscaleMod, "getSubnet")},
			"outscale_subnets":                   {Tok: outscaleDataSource(outscaleMod, "getSubnets")},
			"outscale_subregions":                {Tok: outscaleDataSource(outscaleMod, "getSubregions")},
			"outscale_tag":                       {Tok: outscaleDataSource(outscaleMod, "getTag")},
			"outscale_virtual_gateway":           {Tok: outscaleDataSource(outscaleMod, "getVirtualGateway")},
			"outscale_virtual_gateways":          {Tok: outscaleDataSource(outscaleMod, "getVirtualGateways")},

			"outscale_virtual_gateway_link":              {Tok: outscaleDataSource(outscaleMod, "getVirtualGatewayLink")},
			"outscale_virtual_gateway_route_propagation": {Tok: outscaleDataSource(outscaleMod, "getVirtualGatewayRoutePropagation")},
			"outscale_vm":        {Tok: outscaleDataSource(outscaleMod, "getVm")},
			"outscale_vm_state":  {Tok: outscaleDataSource(outscaleMod, "getVmState")},
			"outscale_vm_states": {Tok: outscaleDataSource(outscaleMod, "getVmStates")},

			"outscale_vm_types": {Tok: outscaleDataSource(outscaleMod, "getVmTypes")},
			"outscale_vms":      {Tok: outscaleDataSource(outscaleMod, "getVms")},

			"outscale_volume":          {Tok: outscaleDataSource(outscaleMod, "getVolume")},
			"outscale_volumes":         {Tok: outscaleDataSource(outscaleMod, "getVolumes")},
			"outscale_volumes_link":    {Tok: outscaleDataSource(outscaleMod, "getVolumesLink")},
			"outscale_vpn_connection":  {Tok: outscaleDataSource(outscaleMod, "getVpnConnection")},
			"outscale_vpn_connections": {Tok: outscaleDataSource(outscaleMod, "getVpnConnections")},

			"outscale_vpn_connection_route": {Tok: outscaleDataSource(outscaleMod, "getVpnConnectionRoute")},
		},
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
