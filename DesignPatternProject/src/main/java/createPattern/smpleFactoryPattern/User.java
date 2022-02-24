package createPattern.smpleFactoryPattern;

public class User {
    public static void main(String[] args) {
        SimpleFactory f=new SimpleFactory();
        Fruit apple=f.create("Apple");
        Fruit pear=f.create("Pear");
        apple.eat();
        pear.eat();
    }
}
