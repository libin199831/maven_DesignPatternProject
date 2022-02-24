package graphicDesignPatterns.strategyPattern;

public class Test {
    public static void main(String[] args) {
        Context context=new Context(new MyMathAdd());
        System.out.println(context.executeMath(12,56));

        context.setMyMath(new MyMathMultiply());
        System.out.println(context.executeMath(4,7));
    }
}
