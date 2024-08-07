// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Outscale.Outputs
{

    [OutputType]
    public sealed class GetRouteTablesRouteTableRouteResult
    {
        /// <summary>
        /// The method used to create the route.
        /// </summary>
        public readonly string CreationMethod;
        /// <summary>
        /// The IP range used for the destination match, in CIDR notation (for example, `10.0.0.0/24`).
        /// </summary>
        public readonly string DestinationIpRange;
        /// <summary>
        /// The ID of the OUTSCALE service.
        /// </summary>
        public readonly string DestinationServiceId;
        /// <summary>
        /// The ID of the Internet service or virtual gateway attached to the Net.
        /// </summary>
        public readonly string GatewayId;
        /// <summary>
        /// The ID of a NAT service attached to the Net.
        /// </summary>
        public readonly string NatServiceId;
        /// <summary>
        /// The ID of the Net access point.
        /// </summary>
        public readonly string NetAccessPointId;
        /// <summary>
        /// The ID of the Net peering.
        /// </summary>
        public readonly string NetPeeringId;
        /// <summary>
        /// The ID of the NIC.
        /// </summary>
        public readonly string NicId;
        /// <summary>
        /// The state of a route in the route table (always `active`).
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The account ID of the owner of the VM.
        /// </summary>
        public readonly string VmAccountId;
        /// <summary>
        /// The ID of a VM specified in a route in the table.
        /// </summary>
        public readonly string VmId;

        [OutputConstructor]
        private GetRouteTablesRouteTableRouteResult(
            string creationMethod,

            string destinationIpRange,

            string destinationServiceId,

            string gatewayId,

            string natServiceId,

            string netAccessPointId,

            string netPeeringId,

            string nicId,

            string state,

            string vmAccountId,

            string vmId)
        {
            CreationMethod = creationMethod;
            DestinationIpRange = destinationIpRange;
            DestinationServiceId = destinationServiceId;
            GatewayId = gatewayId;
            NatServiceId = natServiceId;
            NetAccessPointId = netAccessPointId;
            NetPeeringId = netPeeringId;
            NicId = nicId;
            State = state;
            VmAccountId = vmAccountId;
            VmId = vmId;
        }
    }
}
