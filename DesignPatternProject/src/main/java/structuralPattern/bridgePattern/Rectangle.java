package structuralPattern.bridgePattern;

import structuralPattern.bridgePattern.color.IColor;

public class Rectangle implements IShape{
    private IColor iColor;

    public Rectangle() {
    }

    public Rectangle(IColor iColor) {
        this.iColor = iColor;
    }

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }

    @Override
    public String draw() {
        return "矩形:"+iColor.getColor();
    }
}
