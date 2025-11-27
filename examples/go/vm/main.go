package main

import (
	"github.com/outscale/pulumi-outscale/sdk/go/outscale"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := outscale.NewPublicIp(ctx, "demo-pulumi-public-ip-go", nil)
		if err != nil {
			return err
		}
		return nil
	})
}
