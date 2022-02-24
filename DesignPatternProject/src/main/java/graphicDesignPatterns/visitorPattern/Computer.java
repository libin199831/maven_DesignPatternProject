package graphicDesignPatterns.visitorPattern;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer(){
        parts=new ComputerPart[]{new Keyboard(),new Mouse(),new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart computerPart:parts){
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);

    }
}
