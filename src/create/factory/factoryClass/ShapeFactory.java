package create.factory.factoryClass;

import create.factory.helpers.Circle;
import create.factory.helpers.Rectangle;
import create.factory.helpers.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }

}
