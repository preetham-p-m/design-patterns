package create.factory;

import create.factory.creator.JsonMessageCreator;
import create.factory.creator.MessageCreator;
import create.factory.creator.TextMessageCreator;
import create.factory.models.Message;

public class FactoryMain {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator messageCreator) {
        Message message = messageCreator.getMessage();
        System.out.println(message);
    }
}
