package create.abstract_factory;

import create.abstract_factory.aws.AwsResourceFactory;
import create.abstract_factory.gc.GoogleCloudResourceFactory;
import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.Instance.Capacity;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        FactoryClient awsClient = new FactoryClient(new AwsResourceFactory());
        Instance ec2Instance = awsClient.createServer(Capacity.small, 100);
        ec2Instance.start();
        ec2Instance.stop();

        System.out.println("\n\n");

        FactoryClient gcClient = new FactoryClient(new GoogleCloudResourceFactory());
        Instance gceInstance = gcClient.createServer(Capacity.small, 200);
        System.out.println(gceInstance);
        gceInstance.start();
        gceInstance.stop();

    }
}
