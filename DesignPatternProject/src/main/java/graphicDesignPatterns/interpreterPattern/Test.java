package graphicDesignPatterns.interpreterPattern;

public class Test {
    public static void main(String[] args) {
        Context context=new Context();

        Variable a=new Variable("a");
        Variable b=new Variable("b");
        Variable c=new Variable("c");
        Variable d=new Variable("d");

        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        AbstractExpression abstractExpression=new Minus(a,new Plus(new Minus(b,c),d));

        int result=abstractExpression.interpret(context);
        System.out.println(abstractExpression+"="+result);
    }
}
