package create.abstract_factory;

import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.ResourceFactory;
import create.abstract_factory.interfaces.Storage;

public class FactoryClient {
    private ResourceFactory resourceFactory;

    public FactoryClient(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageCapacityInMiB) {
        Storage storage = this.resourceFactory.createStorage(storageCapacityInMiB);
        Instance instance = this.resourceFactory.createInstance(capacity);
        instance.attachStorage(storage);

        return instance;
    }

}
