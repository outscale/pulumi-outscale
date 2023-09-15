// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getVm(args?: GetVmArgs, opts?: pulumi.InvokeOptions): Promise<GetVmResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("outscale:index/getVm:getVm", {
        "blockDeviceMappingsCreateds": args.blockDeviceMappingsCreateds,
        "bsuOptimized": args.bsuOptimized,
        "deletionProtection": args.deletionProtection,
        "filters": args.filters,
        "imageId": args.imageId,
        "isSourceDestChecked": args.isSourceDestChecked,
        "keypairName": args.keypairName,
        "nics": args.nics,
        "placementSubregionName": args.placementSubregionName,
        "placementTenancy": args.placementTenancy,
        "privateIps": args.privateIps,
        "securityGroupIds": args.securityGroupIds,
        "securityGroupNames": args.securityGroupNames,
        "subnetId": args.subnetId,
        "userData": args.userData,
        "vmId": args.vmId,
        "vmInitiatedShutdownBehavior": args.vmInitiatedShutdownBehavior,
        "vmType": args.vmType,
    }, opts);
}

/**
 * A collection of arguments for invoking getVm.
 */
export interface GetVmArgs {
    blockDeviceMappingsCreateds?: inputs.GetVmBlockDeviceMappingsCreated[];
    bsuOptimized?: boolean;
    deletionProtection?: boolean;
    filters?: inputs.GetVmFilter[];
    imageId?: string;
    isSourceDestChecked?: boolean;
    keypairName?: string;
    nics?: inputs.GetVmNic[];
    placementSubregionName?: string;
    placementTenancy?: string;
    privateIps?: string[];
    securityGroupIds?: string[];
    securityGroupNames?: string[];
    subnetId?: string;
    userData?: string;
    vmId?: string;
    vmInitiatedShutdownBehavior?: string;
    vmType?: string;
}

/**
 * A collection of values returned by getVm.
 */
export interface GetVmResult {
    readonly architecture: string;
    readonly blockDeviceMappingsCreateds: outputs.GetVmBlockDeviceMappingsCreated[];
    readonly bsuOptimized: boolean;
    readonly clientToken: string;
    readonly creationDate: string;
    readonly deletionProtection: boolean;
    readonly filters?: outputs.GetVmFilter[];
    readonly hypervisor: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly imageId: string;
    readonly isSourceDestChecked: boolean;
    readonly keypairName: string;
    readonly launchNumber: number;
    readonly nestedVirtualization: boolean;
    readonly netId: string;
    readonly nics: outputs.GetVmNic[];
    readonly osFamily: string;
    readonly performance: string;
    readonly placementSubregionName: string;
    readonly placementTenancy: string;
    readonly privateDnsName: string;
    readonly privateIp: string;
    readonly privateIps?: string[];
    readonly productCodes: string[];
    readonly publicDnsName: string;
    readonly publicIp: string;
    readonly requestId: string;
    readonly reservationId: string;
    readonly rootDeviceName: string;
    readonly rootDeviceType: string;
    readonly securityGroupIds?: string[];
    readonly securityGroupNames?: string[];
    readonly securityGroups: outputs.GetVmSecurityGroup[];
    readonly state: string;
    readonly stateReason: string;
    readonly subnetId: string;
    readonly tags: outputs.GetVmTag[];
    readonly userData: string;
    readonly vmId: string;
    readonly vmInitiatedShutdownBehavior: string;
    readonly vmType: string;
}
export function getVmOutput(args?: GetVmOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVmResult> {
    return pulumi.output(args).apply((a: any) => getVm(a, opts))
}

/**
 * A collection of arguments for invoking getVm.
 */
export interface GetVmOutputArgs {
    blockDeviceMappingsCreateds?: pulumi.Input<pulumi.Input<inputs.GetVmBlockDeviceMappingsCreatedArgs>[]>;
    bsuOptimized?: pulumi.Input<boolean>;
    deletionProtection?: pulumi.Input<boolean>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetVmFilterArgs>[]>;
    imageId?: pulumi.Input<string>;
    isSourceDestChecked?: pulumi.Input<boolean>;
    keypairName?: pulumi.Input<string>;
    nics?: pulumi.Input<pulumi.Input<inputs.GetVmNicArgs>[]>;
    placementSubregionName?: pulumi.Input<string>;
    placementTenancy?: pulumi.Input<string>;
    privateIps?: pulumi.Input<pulumi.Input<string>[]>;
    securityGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    securityGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    subnetId?: pulumi.Input<string>;
    userData?: pulumi.Input<string>;
    vmId?: pulumi.Input<string>;
    vmInitiatedShutdownBehavior?: pulumi.Input<string>;
    vmType?: pulumi.Input<string>;
}
