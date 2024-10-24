package create.abstract_factory.aws;

import create.abstract_factory.interfaces.Instance;
import create.abstract_factory.interfaces.Storage;

public class EC2Instance implements Instance {

    public EC2Instance(Capacity capacity) {
        System.out.println("Created EC2Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to EC2Instance");
    }

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }

}
