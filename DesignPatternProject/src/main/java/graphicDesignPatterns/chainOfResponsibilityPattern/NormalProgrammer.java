package graphicDesignPatterns.chainOfResponsibilityPattern;

public class NormalProgrammer extends Programmer{
    @Override
    void handle(Bug bug) {
        if(bug.getValue()>20&&bug.getValue()<=50){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }

    }

    private void solve(Bug bug){
        System.out.println("普通程序员解决一个"+bug.getValue()+"的bug");
    }
}
