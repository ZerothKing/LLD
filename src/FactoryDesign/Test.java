package FactoryDesign;

public class Test {
    public static void main(String[] args) {
        Shape circleShape = new ShapeFactory().getShape("Circle");
        Shape rectangleShape = new ShapeFactory().getShape("Rectangle");
        System.out.println(circleShape.getName());
        System.out.println(rectangleShape.getName());
    }
}
