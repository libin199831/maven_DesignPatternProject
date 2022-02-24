package graphicDesignPatterns.strategyPattern;

public class MyMathSubtract implements MyMath {
    @Override
    public int doOperator(int num1, int num2) {
        return num1-num2;
    }
}
