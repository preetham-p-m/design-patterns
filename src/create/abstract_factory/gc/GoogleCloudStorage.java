package create.abstract_factory.gc;

import create.abstract_factory.interfaces.Storage;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMiB) {
        System.out.println("Allocated " + capacityInMiB + " in GoogleCloudStorage");
    }

    @Override
    public String getId() {
        return "GoogleCloudStorage_1";
    }

    @Override
    public String toString() {
        return "GoogleCloudStorage";
    }

}
