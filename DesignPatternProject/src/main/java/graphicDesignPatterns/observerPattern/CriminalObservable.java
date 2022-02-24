package graphicDesignPatterns.observerPattern;

public class CriminalObservable extends Observable{
    public void crime(String even){
        System.out.println("罪犯正在"+even);
        notifyObservers(even);
    }
}
