package structuralPattern.bridgePattern;

import structuralPattern.bridgePattern.color.*;


public class Test {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new Red());
        System.out.println(rectangle.draw());

        Circle circle=new Circle(new Blue());
        System.out.println(circle.draw());

        Triangle triangle=new Triangle(new Green());
        System.out.println(triangle.draw());
    }
}
