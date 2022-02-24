package createPattern.factoryPattern;

public class User {
    public static void main(String[] args) {
        AppleFactory af=new AppleFactory();
        Fruit apple=af.create();

        PearFactory pf=new PearFactory();
        Fruit pear=pf.create();

        apple.eat();
        pear.eat();

    }
}
