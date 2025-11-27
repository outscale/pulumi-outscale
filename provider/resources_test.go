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

	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"

	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/outscale/pulumi-outscale/provider/pkg/version"
)

func Test_ResourceMapping(t *testing.T) {

	expected := map[string]tokens.Type{
		"outscale_access_key":                        outscaleResource(mainMod, "AccessKey"),
		"outscale_api_access_policy":                 outscaleResource(mainMod, "ApiAccessPolicy"),
		"outscale_api_access_rule":                   outscaleResource(mainMod, "ApiAccessRule"),
		"outscale_ca":                                outscaleResource(mainMod, "Ca"),
		"outscale_client_gateway":                    outscaleResource(mainMod, "ClientGateway"),
		"outscale_dhcp_option":                       outscaleResource(mainMod, "DhcpOption"),
		"outscale_flexible_gpu":                      outscaleResource(mainMod, "FlexibleGpu"),
		"outscale_flexible_gpu_link":                 outscaleResource(mainMod, "FlexibleGpuLink"),
		"outscale_image":                             outscaleResource(mainMod, "Image"),
		"outscale_image_export_task":                 outscaleResource(mainMod, "ImageExportTask"),
		"outscale_image_launch_permission":           outscaleResource(mainMod, "ImageLaunchPermission"),
		"outscale_internet_service":                  outscaleResource(mainMod, "InternetService"),
		"outscale_internet_service_link":             outscaleResource(mainMod, "InternetServiceLink"),
		"outscale_keypair":                           outscaleResource(mainMod, "Keypair"),
		"outscale_load_balancer":                     outscaleResource(mainMod, "LoadBalancer"),
		"outscale_load_balancer_attributes":          outscaleResource(mainMod, "LoadBalancerAttributes"),
		"outscale_load_balancer_policy":              outscaleResource(mainMod, "LoadBalancerPolicy"),
		"outscale_load_balancer_vms":                 outscaleResource(mainMod, "LoadBalancerVms"),
		"outscale_nat_service":                       outscaleResource(mainMod, "NatService"),
		"outscale_net":                               outscaleResource(mainMod, "Net"),
		"outscale_net_access_point":                  outscaleResource(mainMod, "NetAccessPoint"),
		"outscale_net_attributes":                    outscaleResource(mainMod, "NetAttributes"),
		"outscale_net_peering":                       outscaleResource(mainMod, "NetPeering"),
		"outscale_net_peering_acceptation":           outscaleResource(mainMod, "NetPeeringAcceptation"),
		"outscale_nic":                               outscaleResource(mainMod, "Nic"),
		"outscale_nic_link":                          outscaleResource(mainMod, "NicLink"),
		"outscale_nic_private_ip":                    outscaleResource(mainMod, "NicPrivateIp"),
		"outscale_outbound_rule":                     outscaleResource(mainMod, "OutboundRule"),
		"outscale_public_ip":                         outscaleResource(mainMod, "PublicIp"),
		"outscale_public_ip_link":                    outscaleResource(mainMod, "PublicIpLink"),
		"outscale_route":                             outscaleResource(mainMod, "Route"),
		"outscale_route_table":                       outscaleResource(mainMod, "RouteTable"),
		"outscale_route_table_link":                  outscaleResource(mainMod, "RouteTableLink"),
		"outscale_security_group":                    outscaleResource(mainMod, "SecurityGroup"),
		"outscale_security_group_rule":               outscaleResource(mainMod, "SecurityGroupRule"),
		"outscale_server_certificate":                outscaleResource(mainMod, "ServerCertificate"),
		"outscale_snapshot":                          outscaleResource(mainMod, "Snapshot"),
		"outscale_snapshot_attributes":               outscaleResource(mainMod, "SnapshotAttributes"),
		"outscale_snapshot_export_task":              outscaleResource(mainMod, "SnapshotExportTask"),
		"outscale_subnet":                            outscaleResource(mainMod, "Subnet"),
		"outscale_virtual_gateway":                   outscaleResource(mainMod, "VirtualGateway"),
		"outscale_virtual_gateway_link":              outscaleResource(mainMod, "VirtualGatewayLink"),
		"outscale_virtual_gateway_route_propagation": outscaleResource(mainMod, "VirtualGatewayRoutePropagation"),
		"outscale_vm":                                outscaleResource(mainMod, "Vm"),
		"outscale_volume":                            outscaleResource(mainMod, "Volume"),
		"outscale_volume_link":                       outscaleResource(mainMod, "VolumeLink"),
		"outscale_vpn_connection":                    outscaleResource(mainMod, "VpnConnection"),
		"outscale_vpn_connection_route":              outscaleResource(mainMod, "VpnConnectionRoute"),

		"outscale_main_route_table_link":       outscaleResource(mainMod, "MainRouteTableLink"),
		"outscale_load_balancer_listener_rule": outscaleResource(mainMod, "LoadBalancerListenerRule"),
		"outscale_user_group":                  outscaleResource(mainMod, "UserGroup"),
		"outscale_user":                        outscaleResource(mainMod, "User"),
		"outscale_policy_version":              outscaleResource(mainMod, "PolicyVersion"),
		"outscale_policy":                      outscaleResource(mainMod, "Policy"),
	}

	version.Version = "v1.0.0"
	provider := Provider()

	seen := make(map[string]bool)

	for name := range provider.Resources {
		seen[name] = false
	}

	for tfName, pulumiType := range expected {
		seen[tfName] = true
		t.Run(fmt.Sprintf("%s => %s", tfName, pulumiType), func(t *testing.T) {
			configuredResource, ok := provider.Resources[tfName]
			require.True(t, ok, "Expected resource %s to be configured", tfName)
			assert.Equal(t, pulumiType, configuredResource.Tok)
		})
	}

	for name, seen := range seen {
		if !seen {
			t.Errorf("Missing specs for %s", name)
		}
	}
}

func Test_DataSourceMapping(t *testing.T) {
	expected := map[string]tokens.ModuleMember{
		"outscale_access_key":        outscaleDataSource(mainMod, "getAccessKey"),
		"outscale_access_keys":       outscaleDataSource(mainMod, "getAccessKeys"),
		"outscale_account":           outscaleDataSource(mainMod, "getAccount"),
		"outscale_accounts":          outscaleDataSource(mainMod, "getAccounts"),
		"outscale_api_access_policy": outscaleDataSource(mainMod, "getApiAccessPolicy"),
		"outscale_api_access_rule":   outscaleDataSource(mainMod, "getApiAccessRule"),
		"outscale_api_access_rules":  outscaleDataSource(mainMod, "getApiAccessRules"),
		"outscale_ca":                outscaleDataSource(mainMod, "getCa"),
		"outscale_cas":               outscaleDataSource(mainMod, "getCas"),
		"outscale_client_gateway":    outscaleDataSource(mainMod, "getClientGateway"),
		"outscale_client_gateways":   outscaleDataSource(mainMod, "getClientGateways"),
		"outscale_dhcp_option":       outscaleDataSource(mainMod, "getDhcpOption"),
		"outscale_dhcp_options":      outscaleDataSource(mainMod, "getDhcpOptions"),
		"outscale_flexible_gpu":      outscaleDataSource(mainMod, "getFlexibleGpu"),
		"outscale_flexible_gpus":     outscaleDataSource(mainMod, "getFlexibleGpus"),

		"outscale_flexible_gpu_catalog":      outscaleDataSource(mainMod, "getFlexibleGpuCatalog"),
		"outscale_image":                     outscaleDataSource(mainMod, "getImage"),
		"outscale_images":                    outscaleDataSource(mainMod, "getImages"),
		"outscale_image_export_task":         outscaleDataSource(mainMod, "getImageExportTask"),
		"outscale_image_export_tasks":        outscaleDataSource(mainMod, "getImageExportTasks"),
		"outscale_internet_service":          outscaleDataSource(mainMod, "getInternetService"),
		"outscale_internet_services":         outscaleDataSource(mainMod, "getInternetServices"),
		"outscale_keypair":                   outscaleDataSource(mainMod, "getKeypair"),
		"outscale_keypairs":                  outscaleDataSource(mainMod, "getKeypairs"),
		"outscale_load_balancer":             outscaleDataSource(mainMod, "getLoadBalancer"),
		"outscale_load_balancer_tags":        outscaleDataSource(mainMod, "getLoadBalancerTags"),
		"outscale_load_balancers":            outscaleDataSource(mainMod, "getLoadBalancers"),
		"outscale_load_balancer_vm_health":   outscaleDataSource(mainMod, "getLoadBalancerVmHealth"),
		"outscale_nat_service":               outscaleDataSource(mainMod, "getNatService"),
		"outscale_nat_services":              outscaleDataSource(mainMod, "getNatServices"),
		"outscale_net":                       outscaleDataSource(mainMod, "getNet"),
		"outscale_nets":                      outscaleDataSource(mainMod, "getNets"),
		"outscale_net_access_points":         outscaleDataSource(mainMod, "getNetAccessPoints"),
		"outscale_net_access_point":          outscaleDataSource(mainMod, "getNetAccessPoint"),
		"outscale_net_access_point_services": outscaleDataSource(mainMod, "getNetAccessPointServices"),
		"outscale_net_attributes":            outscaleDataSource(mainMod, "getNetAttributes"),
		"outscale_net_peering":               outscaleDataSource(mainMod, "getNetPeering"),
		"outscale_net_peerings":              outscaleDataSource(mainMod, "getNetPeerings"),
		"outscale_nic":                       outscaleDataSource(mainMod, "getNic"),
		"outscale_nics":                      outscaleDataSource(mainMod, "getNics"),
		"outscale_product_types":             outscaleDataSource(mainMod, "getProductTypes"),
		"outscale_product_type":              outscaleDataSource(mainMod, "getProductType"),
		"outscale_public_ip":                 outscaleDataSource(mainMod, "getPublicIp"),
		"outscale_public_ips":                outscaleDataSource(mainMod, "getPublicIps"),
		"outscale_quota":                     outscaleDataSource(mainMod, "getQuota"),
		"outscale_quotas":                    outscaleDataSource(mainMod, "getQuotas"),
		"outscale_regions":                   outscaleDataSource(mainMod, "getRegions"),
		"outscale_route_table":               outscaleDataSource(mainMod, "getRouteTable"),
		"outscale_route_tables":              outscaleDataSource(mainMod, "getRouteTables"),
		"outscale_security_group":            outscaleDataSource(mainMod, "getSecurityGroup"),
		"outscale_security_groups":           outscaleDataSource(mainMod, "getSecurityGroups"),
		"outscale_server_certificate":        outscaleDataSource(mainMod, "getServerCertificate"),
		"outscale_server_certificates":       outscaleDataSource(mainMod, "getServerCertificates"),
		"outscale_snapshot":                  outscaleDataSource(mainMod, "getSnapshot"),
		"outscale_snapshots":                 outscaleDataSource(mainMod, "getSnapshots"),
		"outscale_snapshot_export_task":      outscaleDataSource(mainMod, "getSnapshotExportTask"),
		"outscale_snapshot_export_tasks":     outscaleDataSource(mainMod, "getSnapshotExportTasks"),
		"outscale_subnet":                    outscaleDataSource(mainMod, "getSubnet"),
		"outscale_subnets":                   outscaleDataSource(mainMod, "getSubnets"),
		"outscale_subregions":                outscaleDataSource(mainMod, "getSubregions"),
		"outscale_tag":                       outscaleDataSource(mainMod, "getTag"),
		"outscale_virtual_gateway":           outscaleDataSource(mainMod, "getVirtualGateway"),
		"outscale_virtual_gateways":          outscaleDataSource(mainMod, "getVirtualGateways"),

		"outscale_vm":        outscaleDataSource(mainMod, "getVm"),
		"outscale_vm_state":  outscaleDataSource(mainMod, "getVmState"),
		"outscale_vm_states": outscaleDataSource(mainMod, "getVmStates"),

		"outscale_vm_types": outscaleDataSource(mainMod, "getVmTypes"),
		"outscale_vms":      outscaleDataSource(mainMod, "getVms"),

		"outscale_volume":          outscaleDataSource(mainMod, "getVolume"),
		"outscale_volumes":         outscaleDataSource(mainMod, "getVolumes"),
		"outscale_vpn_connection":  outscaleDataSource(mainMod, "getVpnConnection"),
		"outscale_vpn_connections": outscaleDataSource(mainMod, "getVpnConnections"),

		"outscale_users":                         outscaleDataSource(mainMod, "getUsers"),
		"outscale_policies_linked_to_user_group": outscaleDataSource(mainMod, "getPoliciesLinkedToUserGroup"),
		"outscale_user":                          outscaleDataSource(mainMod, "getUser"),
		"outscale_policies_linked_to_user":       outscaleDataSource(mainMod, "getPoliciesLinkedToUser"),
		"outscale_entities_linked_to_policy":     outscaleDataSource(mainMod, "getEntitiesLinkedToPolicy"),
		"outscale_user_group":                    outscaleDataSource(mainMod, "getUserGroup"),
		"outscale_user_groups_per_user":          outscaleDataSource(mainMod, "getUserGroupsPerUser"),
		"outscale_policy":                        outscaleDataSource(mainMod, "getPolicy"),
		"outscale_load_balancer_listener_rule":   outscaleDataSource(mainMod, "getLoadBalancerListenerRule"),
		"outscale_policies":                      outscaleDataSource(mainMod, "getPolicies"),
		"outscale_load_balancer_listener_rules":  outscaleDataSource(mainMod, "getLoadBalancerListenerRules"),
		"outscale_public_catalog":                outscaleDataSource(mainMod, "getPublicCatalog"),
		"outscale_user_groups":                   outscaleDataSource(mainMod, "getUserGroups"),
		"outscale_tags":                          outscaleDataSource(mainMod, "getTags"),
	}

	version.Version = "v1.0.0"
	provider := Provider()

	seen := make(map[string]bool)

	for name := range provider.DataSources {
		seen[name] = false
	}

	for tfName, pulumiType := range expected {
		seen[tfName] = true
		t.Run(fmt.Sprintf("%s => %s", tfName, pulumiType), func(t *testing.T) {
			configuredDatasource, ok := provider.DataSources[tfName]
			require.True(t, ok, "Expected resource %s to be configured", tfName)
			assert.Equal(t, pulumiType, configuredDatasource.Tok)
		})
	}

	for name, seen := range seen {
		if !seen {
			t.Errorf("Missing specs for %s", name)
		}
	}
}
