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
