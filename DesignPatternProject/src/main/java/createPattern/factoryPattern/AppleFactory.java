package createPattern.factoryPattern;

public class AppleFactory {
    public Fruit create(){
        return new Apple();
    }
}

class Apple extends Fruit{
    @Override
    public void eat() {
        System.out.println("Apple eating!!! gaga");
    }
}
