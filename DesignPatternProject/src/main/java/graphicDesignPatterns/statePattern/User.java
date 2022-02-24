package graphicDesignPatterns.statePattern;

public class User implements ISwitchState,IUser {
    private IUser state=new NormalUser();
    @Override
    public void purchasePlus() {
        state=new PLUSUser();

    }

    @Override
    public void expire() {
        state=new NormalUser();

    }

    @Override
    public void mockInterview() {
        state.mockInterview();
    }
}
