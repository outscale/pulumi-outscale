// Copyright 2024, Pulumi Corporation.  All rights reserved.
//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccHelloTs(t *testing.T) {
	opts := getJSBaseOptions(t).With(integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "ts", "hello"),
	})

	integration.ProgramTest(t, &opts)
}

func TestAccUserTs(t *testing.T) {
	opts := getJSBaseOptions(t).With(integration.ProgramTestOptions{
		Dir: filepath.Join(getCwd(t), "ts", "user"),
	})

	integration.ProgramTest(t, &opts)
}
