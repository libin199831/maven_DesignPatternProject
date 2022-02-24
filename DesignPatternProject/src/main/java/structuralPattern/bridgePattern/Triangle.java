package structuralPattern.bridgePattern;

import structuralPattern.bridgePattern.color.IColor;

public class Triangle implements IShape{
    private IColor iColor;

    public Triangle() {
    }

    public Triangle(IColor iColor) {
        this.iColor = iColor;
    }

    public void setiColor(IColor iColor) {
        this.iColor = iColor;
    }
    @Override
    public String draw() {
        return "三角形:"+iColor.getColor();
    }
}
