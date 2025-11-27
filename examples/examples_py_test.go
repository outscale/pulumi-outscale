// Copyright 2024, Pulumi Corporation.  All rights reserved.
//go:build python || all
// +build python all

package examples

import (
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccHelloPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "python", "hello"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccUserPy(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "python", "user"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccSnakePy(t *testing.T) {
	t.Skip("Skipping: example requires additional configuration (publicKeyPath, user, publicSshKeyPath, privateKeyPath)")

	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: filepath.Join(getCwd(t), "python", "snake"),
		})

	integration.ProgramTest(t, &test)
}
