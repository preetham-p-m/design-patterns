package create.abstract_factory.aws;

import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.ResourceFactory;
import create.abstract_factory.interfaces.Storage;
import create.abstract_factory.interfaces.Instance.Capacity;

public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMiB) {
        return new S3Storage(capacityInMiB);
    }

}
