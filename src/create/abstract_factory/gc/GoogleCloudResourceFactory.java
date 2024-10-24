package create.abstract_factory.gc;

import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.ResourceFactory;
import create.abstract_factory.interfaces.Storage;
import create.abstract_factory.interfaces.Instance.Capacity;

public class GoogleCloudResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputingEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMiB) {
        return new GoogleCloudStorage(capacityInMiB);
    }

}
