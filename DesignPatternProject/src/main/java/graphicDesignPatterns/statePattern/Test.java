package graphicDesignPatterns.statePattern;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        user.mockInterview();

        user.purchasePlus();
        user.mockInterview();

        user.expire();
        user.mockInterview();
    }
}
