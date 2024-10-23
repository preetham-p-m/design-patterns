package create.factory.creator;

import create.factory.models.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        var message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();
}
