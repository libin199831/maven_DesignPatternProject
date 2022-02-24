package structuralPattern.decoratorPattern.shapeDecorator;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
