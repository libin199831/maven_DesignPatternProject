package createPattern.abstractFactoryPattern;


public class PearFactory implements Factory{
    public Pear create(){
        return new Pear();
    }
}

class Pear extends Fruit {

    @Override
    public void eat() {
        System.out.println("Pear eating!!! kaka");
    }
}
