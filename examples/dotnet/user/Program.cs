using Pulumi;
using Pulumi.Outscale;
using Pulumi.Outscale.Inputs;
using System;
using System.Linq;
using System.Text;

return await Deployment.RunAsync(() =>
{
    var config = new Pulumi.Config();

    // Get the latest Outscale image
    var images = GetImages.Invoke(new GetImagesInvokeArgs
    {
        Filters = new[]
        {
            new GetImagesFilterInputArgs
            {
                Name = "account_aliases",
                Values = new[] { "Outscale" },
            },
            new GetImagesFilterInputArgs
            {
                Name = "image_names",
                Values = new[] { "Ubuntu*", "RockyLinux*" },
            },
        },
    });

    var configImageId = config.Get("imageId");
    Output<string> imageId = !string.IsNullOrEmpty(configImageId)
        ? Output.Create(configImageId)
        : images.Apply(i => i.Images[0].ImageId);

    var group = new Pulumi.Outscale.SecurityGroup("webserver-secgrp", new SecurityGroupArgs
    {
        Description = "test"
    });

    var userData = @"
                #!/bin/bash
                echo ""Hello, World!"" > index.html
                nohup python -m SimpleHTTPServer 80 &
                ";

    var userDataBase64 = Convert.ToBase64String(Encoding.UTF8.GetBytes(userData));

    var server = new Pulumi.Outscale.Vm("webserver-www", new VmArgs
    {
        VmType = "tinav5.c1r1p1",
        SecurityGroupIds = new[] {
            group.Id
        },
        UserData = userDataBase64,
        ImageId = imageId,
    });

});
