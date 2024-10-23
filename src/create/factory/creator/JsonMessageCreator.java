package create.factory.creator;

import create.factory.models.JsonMessage;
import create.factory.models.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }

}
