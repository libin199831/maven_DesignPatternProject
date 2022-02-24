package graphicDesignPatterns.templatePattern.leaveTest;

public abstract class LeaveRequest {
    public void request(){
        System.out.println("本人"+name()+"，因"+reason()+"，请假"+duration()+"!");
    }

    abstract String duration();

    abstract String reason();

    abstract String name();
}
