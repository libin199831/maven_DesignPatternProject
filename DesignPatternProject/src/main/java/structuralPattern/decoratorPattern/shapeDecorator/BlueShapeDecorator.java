package structuralPattern.decoratorPattern.shapeDecorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setBlueBorder(shapeDecorator);
    }

    private void setBlueBorder(Shape shapeDecorator){
        System.out.println("Border Color: Blue");
    }
}
