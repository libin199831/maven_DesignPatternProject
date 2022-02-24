package graphicDesignPatterns.observerPattern;

public class Test {
    public static void main(String[] args){
        Observer p1 = new PoliceObserver("p1");
        Observer p2 = new PoliceObserver("p2");
        Observer p3 = new PoliceObserver("p3");
        Observer p4 = new PoliceObserver("p4");

        CriminalObservable observable = new CriminalObservable();

        observable.addObserver(p1);
        observable.addObserver(p2);
        observable.addObserver(p4);

        observable.crime("抢劫");

    }

}
