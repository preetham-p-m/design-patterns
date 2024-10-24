package create.abstract_factory.gc;

import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.Storage;

public class GoogleComputingEngineInstance implements Instance {

    public GoogleComputingEngineInstance(Capacity capacity) {
        System.out.println("Created GoogleComputingEngineInstance");
    }

    @Override
    public void start() {
        System.out.println("GoogleComputingEngineInstance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to GoogleComputingEngineInstance");
    }

    @Override
    public void stop() {
        System.out.println("GoogleComputingEngineInstance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputingEngineInstance";
    }

}
