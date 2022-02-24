package createPattern.abstractFactoryPattern;


public class User {
    public static void main(String[] args) {
        Factory af=new AppleFactory();
        Fruit apple=af.create();

        Factory pf=new PearFactory();
        Fruit pear=pf.create();

        apple.eat();
        pear.eat();

    }
}
