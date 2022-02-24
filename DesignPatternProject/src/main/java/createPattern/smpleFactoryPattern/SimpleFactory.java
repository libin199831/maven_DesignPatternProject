package createPattern.smpleFactoryPattern;

/**
 *
 */
public class SimpleFactory {
    public Fruit create(String type){
        if("Apple".equals(type)){
            return new Apple();
        }
        else if("Pear".equals(type)){
            return new Pear();
        }
        else{
            throw new IllegalArgumentException(" not this fruit.............");
        }
    }
}


class Fruit{
    public void eat(){}

}

class Apple extends Fruit{
    @Override
    public void eat() {
        System.out.println("eat apple!!!!");
    }
}

class Pear extends Fruit{
    @Override
    public void eat() {
        System.out.println("eat pear!!!!");
    }
}
