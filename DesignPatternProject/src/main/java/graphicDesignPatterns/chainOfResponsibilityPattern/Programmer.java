package graphicDesignPatterns.chainOfResponsibilityPattern;

public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next) {
        this.next = next;
    }
    abstract void handle(Bug bug);
}
