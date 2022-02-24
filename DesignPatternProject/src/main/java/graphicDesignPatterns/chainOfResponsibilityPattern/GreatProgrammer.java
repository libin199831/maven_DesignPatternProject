package graphicDesignPatterns.chainOfResponsibilityPattern;

public class GreatProgrammer extends Programmer{
    @Override
    void handle(Bug bug) {
        if(bug.getValue()>50&&bug.getValue()<=100){
            solve(bug);
        }else if(next!=null){
            next.handle(bug);
        }

    }

    private void solve(Bug bug){
        System.out.println("优秀程序员解决一个"+bug.getValue()+"的bug");
    }
}
