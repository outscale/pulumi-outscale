using Pulumi;
using Pulumi.Outscale;

return await Deployment.RunAsync(() =>
{
    var group = new Pulumi.Outscale.SecurityGroup("webserver-secgrp", new SecurityGroupArgs
    {
	    Description = "test"
    });

    var userData = @"
                #!/bin/bash
                echo ""Hello, World!"" > index.html
                nohup python -m SimpleHTTPServer 80 &
                ";

    var server = new Pulumi.Outscale.Vm("webserver-www", new VmArgs
    {
        // t2.micro is available in the AWS free tier
        VmType = "t2.micro",
        SecurityGroupIds = new[] {
		group.Id
	}, // reference the security group resource above
        UserData = userData,
        ImageId = "ami-cd8d714e",
    });

});
