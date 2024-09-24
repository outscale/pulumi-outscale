//go:build nodejs || all
// +build nodejs all

package examples

import (
	//"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

/*
func TestAccUsers(t *testing.T) {
	test := getJsBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "ts/user"),
		})
	integration.ProgramTest(t, &test)
}
*/

func getJsBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		Dependencies: []string{
			"@outscale/pulumi-outscale",
		},
	})
	return baseJS
}
