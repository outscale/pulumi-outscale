// Copyright 2024, Pulumi Corporation.  All rights reserved.
//go:build go || all
// +build go all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccVmGo(t *testing.T) {
	opts := getGoBaseOptions(t).With(integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "go", "vm"),
	})

	integration.ProgramTest(t, &opts)
}

func TestAccPublicIpGo(t *testing.T) {
	opts := getGoBaseOptions(t).With(integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "go", "public_ip"),
		ExtraRuntimeValidation: func(t *testing.T, stack integration.RuntimeValidationStackInfo) {
			validation := stack.Outputs["test-validation"].(string)
			if validation == "" {
				t.Fatal("test-validation output is missing")
			}
			if validation[:6] == "FAILED" {
				t.Fatalf("PublicIp validation failed: %s", validation)
			}
			t.Logf("PublicIp validation: %s", validation)

			publicIp := stack.Outputs["publicIp"].(string)
			publicIpId := stack.Outputs["publicIpId"].(string)

			if publicIp == "" {
				t.Fatal("publicIp output is empty")
			}
			if publicIpId == "" {
				t.Fatal("publicIpId output is empty")
			}

			t.Logf("PublicIp: %s, PublicIpId: %s", publicIp, publicIpId)
		},
	})

	integration.ProgramTest(t, &opts)
}
