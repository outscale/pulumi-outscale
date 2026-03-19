package main

import (
	"fmt"

	"github.com/outscale/pulumi-outscale/sdk/go/outscale"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		publicIp, err := outscale.NewPublicIp(ctx, "public-ip", nil)
		if err != nil {
			return err
		}

		ctx.Export("publicIp", publicIp.PublicIp)
		ctx.Export("publicIpId", publicIp.PublicIpId)
		ctx.Export("privateIp", publicIp.PrivateIp)
		ctx.Export("nicId", publicIp.NicId)

		publicIp.PublicIp.ApplyT(func(ip string) string {
			fmt.Printf("Public IP: %s\n", ip)
			return ip
		})

		publicIp.PublicIpId.ApplyT(func(id string) string {
			fmt.Printf("Public IP ID: %s\n", id)
			return id
		})

		publicIp.PrivateIp.ApplyT(func(ip string) string {
			fmt.Printf("Private IP: %s\n", ip)
			return ip
		})

		publicIp.NicId.ApplyT(func(id string) string {
			fmt.Printf("Nic ID: %s\n", id)
			return id
		})

		ctx.Export("test-validation", pulumi.All(publicIp.PublicIp, publicIp.PublicIpId).ApplyT(func(args []any) string {
			ip := args[0].(string)
			id := args[1].(string)

			if ip == "" || id == "" {
				return fmt.Sprintf("FAILED: PublicIp='%s' PublicIpId='%s', at least one is empty", ip, id)
			}
			return fmt.Sprintf("PASSED: PublicIp='%s' PublicIpId='%s'", ip, id)
		}))

		return nil
	})
}
