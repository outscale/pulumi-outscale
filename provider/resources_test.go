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
	"testing"

	"github.com/outscale/pulumi-outscale/provider/pkg/version"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func Test_ResourceMapping(t *testing.T) {

	expected := map[string]tokens.Type{
		"outscale_access_key":                        outscaleResource(outscaleMod, "AccessKey"),
		"outscale_api_access_policy":                 outscaleResource(outscaleMod, "ApiAccessPolicy"),
		"outscale_api_access_rule":                   outscaleResource(outscaleMod, "ApiAccessRule"),
		"outscale_ca":                                outscaleResource(outscaleMod, "Ca"),
		"outscale_client_gateway":                    outscaleResource(outscaleMod, "ClientGateway"),
		"outscale_dhcp_option":                       outscaleResource(outscaleMod, "DhcpOption"),
		"outscale_flexible_gpu":                      outscaleResource(outscaleMod, "FlexibleGpu"),
		"outscale_flexible_gpu_link":                 outscaleResource(outscaleMod, "FlexibleGpuLink"),
		"outscale_image":                             outscaleResource(outscaleMod, "Image"),
		"outscale_image_export_task":                 outscaleResource(outscaleMod, "ImageExportTask"),
		"outscale_image_launch_permission":           outscaleResource(outscaleMod, "ImageLaunchPermission"),
		"outscale_internet_service":                  outscaleResource(outscaleMod, "InternetService"),
		"outscale_internet_service_link":             outscaleResource(outscaleMod, "InternetServiceLink"),
		"outscale_keypair":                           outscaleResource(outscaleMod, "Keypair"),
		"outscale_load_balancer":                     outscaleResource(outscaleMod, "LoadBalancer"),
		"outscale_load_balancer_attributes":          outscaleResource(outscaleMod, "LoadBalancerAttributes"),
		"outscale_load_balancer_policy":              outscaleResource(outscaleMod, "LoadBalancerPolicy"),
		"outscale_load_balancer_vms":                 outscaleResource(outscaleMod, "LoadBalancerVms"),
		"outscale_nat_service":                       outscaleResource(outscaleMod, "NatService"),
		"outscale_net":                               outscaleResource(outscaleMod, "Net"),
		"outscale_net_access_point":                  outscaleResource(outscaleMod, "NetAccessPoint"),
		"outscale_net_attributes":                    outscaleResource(outscaleMod, "NetAttributes"),
		"outscale_net_peering":                       outscaleResource(outscaleMod, "NetPeering"),
		"outscale_net_peering_acceptation":           outscaleResource(outscaleMod, "NetPeeringAcception"),
		"outscale_nic":                               outscaleResource(outscaleMod, "Nic"),
		"outscale_nic_link":                          outscaleResource(outscaleMod, "NicLink"),
		"outscale_nic_private_ip":                    outscaleResource(outscaleMod, "NicPrivateIp"),
		"outscale_outbound_rule":                     outscaleResource(outscaleMod, "OutboundRule"),
		"outscale_public_ip":                         outscaleResource(outscaleMod, "PublicIp"),
		"outscale_public_ip_link":                    outscaleResource(outscaleMod, "PublicIpLink"),
		"outscale_route":                             outscaleResource(outscaleMod, "Route"),
		"outscale_route_table":                       outscaleResource(outscaleMod, "RouteTable"),
		"outscale_route_table_link":                  outscaleResource(outscaleMod, "RouteTableLink"),
		"outscale_security_group":                    outscaleResource(outscaleMod, "SecurityGroup"),
		"outscale_security_group_rule":               outscaleResource(outscaleMod, "SecurityGroupRule"),
		"outscale_server_certificate":                outscaleResource(outscaleMod, "ServerCertificate"),
		"outscale_snapshot":                          outscaleResource(outscaleMod, "Snapshot"),
		"outscale_snapshot_attributes":               outscaleResource(outscaleMod, "SnapshotAttributes"),
		"outscale_snapshot_export_task":              outscaleResource(outscaleMod, "SnapshotExportTask"),
		"outscale_subnet":                            outscaleResource(outscaleMod, "Subnet"),
		"outscale_tag":                               outscaleResource(outscaleMod, "Tag"),
		"outscale_virtual_gateway":                   outscaleResource(outscaleMod, "VirtualGateway"),
		"outscale_virtual_gateway_link":              outscaleResource(outscaleMod, "VirtualGatewayLink"),
		"outscale_virtual_gateway_route_propagation": outscaleResource(outscaleMod, "VirtualGatewayRoutePropagation"),
		"outscale_vm":                                outscaleResource(outscaleMod, "Vm"),
		"outscale_volume":                            outscaleResource(outscaleMod, "Volume"),
		"outscale_volumes_link":                      outscaleResource(outscaleMod, "VolumesLink"),
		"outscale_vpn_connection":                    outscaleResource(outscaleMod, "VpnConnection"),
		"outscale_vpn_connection_route":              outscaleResource(outscaleMod, "VpnConnectionRoute"),
	}

	version.Version = "v1.0.0"
	provider := Provider()

	for tfName, pulumiType := range expected {
		t.Run(fmt.Sprintf("%s => %s", tfName, pulumiType), func(t *testing.T) {
			configuredResource, ok := provider.Resources[tfName]
			require.True(t, ok, "Expected resource %s to be configured", tfName)
			assert.Equal(t, pulumiType, configuredResource.Tok)
		})
	}
}

func Test_DataSourceMapping(t *testing.T) {
	expected := map[string]tokens.ModuleMember{
		"outscale_access_key":        outscaleDataSource(outscaleMod, "getAccessKey"),
		"outscale_access_keys":       outscaleDataSource(outscaleMod, "getAccessKeys"),
		"outscale_account":           outscaleDataSource(outscaleMod, "getAccount"),
		"outscale_accounts":          outscaleDataSource(outscaleMod, "getAccounts"),
		"outscale_api_access_policy": outscaleDataSource(outscaleMod, "getApiAccessPolicy"),
		"outscale_api_access_rule":   outscaleDataSource(outscaleMod, "getApiAccessRule"),
		"outscale_api_access_rules":  outscaleDataSource(outscaleMod, "getApiAccessRules"),
		"outscale_ca":                outscaleDataSource(outscaleMod, "getCa"),
		"outscale_cas":               outscaleDataSource(outscaleMod, "getCas"),
		"outscale_client_gateway":    outscaleDataSource(outscaleMod, "getClientGateway"),
		"outscale_client_gateways":   outscaleDataSource(outscaleMod, "getClientGateways"),
		"outscale_dhcp_option":       outscaleDataSource(outscaleMod, "getDhcpOption"),
		"outscale_dhcp_options":      outscaleDataSource(outscaleMod, "getDhcpOptions"),
		"outscale_flexible_gpu":      outscaleDataSource(outscaleMod, "getFlexibleGpu"),
		"outscale_flexible_gpus":     outscaleDataSource(outscaleMod, "getFlexibleGpus"),

		"outscale_flexible_gpu_catalog":      outscaleDataSource(outscaleMod, "getFlexibleGpuCatalog"),
		"outscale_image":                     outscaleDataSource(outscaleMod, "getImage"),
		"outscale_images":                    outscaleDataSource(outscaleMod, "getImages"),
		"outscale_image_export_task":         outscaleDataSource(outscaleMod, "getImageExportTask"),
		"outscale_image_export_tasks":        outscaleDataSource(outscaleMod, "getImageExportTasks"),
		"outscale_image_launch_permission":   outscaleDataSource(outscaleMod, "getImageLaunchPermission"),
		"outscale_internet_service":          outscaleDataSource(outscaleMod, "getInternetService"),
		"outscale_internet_services":         outscaleDataSource(outscaleMod, "getInternetServices"),
		"outscale_internet_service_link":     outscaleDataSource(outscaleMod, "getInternetServiceLink"),
		"outscale_keypair":                   outscaleDataSource(outscaleMod, "getKeypair"),
		"outscale_keypairs":                  outscaleDataSource(outscaleMod, "getKeypairs"),
		"outscale_load_balancer":             outscaleDataSource(outscaleMod, "getLoadBalancer"),
		"outscale_load_balancer_tags":        outscaleDataSource(outscaleMod, "getLoadBalancerTags"),
		"outscale_load_balancers":            outscaleDataSource(outscaleMod, "getLoadBalancers"),
		"outscale_load_balancer_attributes":  outscaleDataSource(outscaleMod, "getLoadBalancerAttributes"),
		"outscale_load_balancer_vms":         outscaleDataSource(outscaleMod, "getLoadBalancerVms"),
		"outscale_load_balancer_vm_health":   outscaleDataSource(outscaleMod, "getLoadBalancerVmHealth"),
		"outscale_nat_service":               outscaleDataSource(outscaleMod, "getNatService"),
		"outscale_nat_services":              outscaleDataSource(outscaleMod, "getNatServices"),
		"outscale_net":                       outscaleDataSource(outscaleMod, "getNet"),
		"outscale_nets":                      outscaleDataSource(outscaleMod, "getNets"),
		"outscale_net_access_points":         outscaleDataSource(outscaleMod, "getNetAccessPoints"),
		"outscale_net_access_point":          outscaleDataSource(outscaleMod, "getNetAccessPoint"),
		"outscale_net_access_point_services": outscaleDataSource(outscaleMod, "getNetAccessPointServices"),
		"outscale_net_attributes":            outscaleDataSource(outscaleMod, "getNetAttributes"),
		"outscale_net_peering":               outscaleDataSource(outscaleMod, "getNetPeering"),
		"outscale_net_peerings":              outscaleDataSource(outscaleMod, "getNetPeerings"),
		"outscale_net_peering_acceptation":   outscaleDataSource(outscaleMod, "getNetPeeringAcceptation"),
		"outscale_nic":                       outscaleDataSource(outscaleMod, "getNic"),
		"outscale_nics":                      outscaleDataSource(outscaleMod, "getNics"),
		"outscale_nic_link":                  outscaleDataSource(outscaleMod, "getNicLink"),
		"outscale_nic_private_ip":            outscaleDataSource(outscaleMod, "getNicPrivateIp"),
		"outscale_outbound_rule":             outscaleDataSource(outscaleMod, "getOutboundRule"),
		"outscale_product_types":             outscaleDataSource(outscaleMod, "getProductTypes"),
		"outscale_product_type":              outscaleDataSource(outscaleMod, "getProductType"),
		"outscale_public_catalog":            outscaleDataSource(outscaleMod, "getPulicCatalog"),
		"outscale_public_ip":                 outscaleDataSource(outscaleMod, "getPublicIp"),
		"outscale_public_ips":                outscaleDataSource(outscaleMod, "getPublicIps"),
		"outscale_public_ip_link":            outscaleDataSource(outscaleMod, "getPublicIpLink"),
		"outscale_quota":                     outscaleDataSource(outscaleMod, "getQuota"),
		"outscale_quotas":                    outscaleDataSource(outscaleMod, "getQuotas"),
		"outscale_regions":                   outscaleDataSource(outscaleMod, "getRegions"),
		"outscale_route":                     outscaleDataSource(outscaleMod, "getRoute"),
		"outscale_route_table":               outscaleDataSource(outscaleMod, "getRouteTable"),
		"outscale_route_tables":              outscaleDataSource(outscaleMod, "getRouteTables"),
		"outscale_route_table_link":          outscaleDataSource(outscaleMod, "getRouteTableLink"),
		"outscale_security_group":            outscaleDataSource(outscaleMod, "getSecurityGroup"),
		"outscale_security_groups":           outscaleDataSource(outscaleMod, "getSecurityGroups"),
		"outscale_security_group_rule":       outscaleDataSource(outscaleMod, "getSecurityGroupRule"),
		"outscale_server_certificate":        outscaleDataSource(outscaleMod, "getServerCertificate"),
		"outscale_server_certificates":       outscaleDataSource(outscaleMod, "getServerCertificates"),
		"outscale_snapshot":                  outscaleDataSource(outscaleMod, "getSnapshot"),
		"outscale_snapshots":                 outscaleDataSource(outscaleMod, "getSnapshots"),
		"outscale_snapshot_export_task":      outscaleDataSource(outscaleMod, "getSnapshotExportTask"),
		"outscale_snapshot_export_tasks":     outscaleDataSource(outscaleMod, "getSnapshotExportTasks"),
		"outscale_snapshot_attributes":       outscaleDataSource(outscaleMod, "getSnapshotAttributes"),
		"outscale_subnet":                    outscaleDataSource(outscaleMod, "getSubnet"),
		"outscale_subnets":                   outscaleDataSource(outscaleMod, "getSubnets"),
		"outscale_subregions":                outscaleDataSource(outscaleMod, "getSubregions"),
		"outscale_tag":                       outscaleDataSource(outscaleMod, "getTag"),
		"outscale_virtual_gateway":           outscaleDataSource(outscaleMod, "getVirtualGateway"),
		"outscale_virtual_gateways":          outscaleDataSource(outscaleMod, "getVirtualGateways"),

		"outscale_virtual_gateway_link":              outscaleDataSource(outscaleMod, "getVirtualGatewayLink"),
		"outscale_virtual_gateway_route_propagation": outscaleDataSource(outscaleMod, "getVirtualGatewayRoutePropagation"),
		"outscale_vm":        outscaleDataSource(outscaleMod, "getVm"),
		"outscale_vm_state":  outscaleDataSource(outscaleMod, "getVmState"),
		"outscale_vm_states": outscaleDataSource(outscaleMod, "getVmStates"),

		"outscale_vm_types": outscaleDataSource(outscaleMod, "getVmTypes"),
		"outscale_vms":      outscaleDataSource(outscaleMod, "getVms"),

		"outscale_volume":          outscaleDataSource(outscaleMod, "getVolume"),
		"outscale_volumes":         outscaleDataSource(outscaleMod, "getVolumes"),
		"outscale_volumes_link":    outscaleDataSource(outscaleMod, "getVolumesLink"),
		"outscale_vpn_connection":  outscaleDataSource(outscaleMod, "getVpnConnection"),
		"outscale_vpn_connections": outscaleDataSource(outscaleMod, "getVpnConnections"),

		"outscale_vpn_connection_route": outscaleDataSource(outscaleMod, "getVpnConnectionRoute"),
	}

	version.Version = "v1.0.0"
	provider := Provider()

	for tfName, pulumiType := range expected {
		t.Run(fmt.Sprintf("%s => %s", tfName, pulumiType), func(t *testing.T) {
			configuredDatasource, ok := provider.DataSources[tfName]
			require.True(t, ok, "Expected resource %s to be configured", tfName)
			assert.Equal(t, pulumiType, configuredDatasource.Tok)
		})
	}
}
