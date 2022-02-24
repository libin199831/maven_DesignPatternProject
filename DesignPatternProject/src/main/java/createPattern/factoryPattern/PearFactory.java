package createPattern.factoryPattern;

public class PearFactory {
    public Fruit create(){
        return new Pear();
    }
}
class Pear extends Fruit{

    @Override
    public void eat() {
        System.out.println("Pear eating!!!");
    }
}
