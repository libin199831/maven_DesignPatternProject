package graphicDesignPatterns.statePattern;

public class NormalUser implements IUser {
    @Override
    public void mockInterview() {
        System.out.println("模拟面试会员专享！");
    }
}
