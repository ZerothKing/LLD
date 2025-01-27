package FactoryDesign;


public class ShapeFactory {
    Shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
