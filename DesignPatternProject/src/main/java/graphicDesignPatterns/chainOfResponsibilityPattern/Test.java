package graphicDesignPatterns.chainOfResponsibilityPattern;

public class Test {
    public static void main(String[] args) {
        Bug bug1=new Bug(15);
        Bug bug2=new Bug(35);
        Bug bug3=new Bug(75);

        Programmer newbie=new NewbieProgrammer();
        Programmer normal=new NormalProgrammer();
        Programmer great=new GreatProgrammer();

        newbie.setNext(normal);
        normal.setNext(great);

        newbie.handle(bug1);
        newbie.handle(bug2);
        newbie.handle(bug3);

        newbie.handle(new Bug(101));

    }
}
