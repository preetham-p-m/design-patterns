package create.factory;

import create.factory.factoryClass.ShapeFactory;
import create.factory.helpers.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}
