package graphicDesignPatterns.chainOfResponsibilityPattern;

public class NewbieProgrammer extends Programmer{
    @Override
    void handle(Bug bug) {
        if(bug.getValue()>0&&bug.getValue()<=20){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }

    }

    private void solve(Bug bug){
        System.out.println("菜鸟程序员解决一个"+bug.getValue()+"的bug");
    }
}
