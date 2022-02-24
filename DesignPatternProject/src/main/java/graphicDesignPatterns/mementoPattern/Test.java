package graphicDesignPatterns.mementoPattern;

public class Test {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        originator.setState("state 1");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("state 2");
        System.out.println(originator);

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println(originator);

    }
}
