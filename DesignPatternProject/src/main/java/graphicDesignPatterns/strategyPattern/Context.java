package graphicDesignPatterns.strategyPattern;

public class Context {
    private MyMath myMath;

    public Context(MyMath myMath){
        this.myMath=myMath;
    }

    public void setMyMath(MyMath myMath) {
        this.myMath = myMath;
    }

    public int executeMath(int num1,int num2){

        return myMath.doOperator(num1,num2);
    }

}
