package create.factory.creator;

import create.factory.models.Message;
import create.factory.models.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }

}
