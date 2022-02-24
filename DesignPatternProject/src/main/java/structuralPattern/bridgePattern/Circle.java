package structuralPattern.bridgePattern;

import structuralPattern.bridgePattern.color.IColor;

public class Circle implements IShape{
    private IColor iColor;

    public Circle() {
    }

    public Circle(IColor iColor) {
        this.iColor = iColor;
    }

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }

    @Override
    public String draw() {
        return "圆形:"+iColor.getColor();
    }
}
