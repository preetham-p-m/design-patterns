package create.abstract_factory.interfaces;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capacityInMiB);

}
