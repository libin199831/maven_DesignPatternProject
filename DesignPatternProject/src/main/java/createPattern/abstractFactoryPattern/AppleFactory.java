package createPattern.abstractFactoryPattern;


public class AppleFactory implements Factory{
    public Apple create(){
        return new Apple();
    }
}

class Apple extends Fruit {
    @Override
    public void eat() {
        System.out.println("Apple eating!!! gaga");
    }
}
