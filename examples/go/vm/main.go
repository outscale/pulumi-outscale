package main

import (
	"fmt"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/outscale/pulumi-outscale/sdk/go/outscale"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ip, err  := outscale.NewPublicIp(ctx, "demo-pulumi-public-ip-go", nil)
		if err != nil {
			return err
		}
		fmt.Println("%#v", ip);
		return nil
	})
}
