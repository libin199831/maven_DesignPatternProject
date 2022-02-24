package graphicDesignPatterns.observerPattern;

import java.security.PrivateKey;

public class PoliceObserver implements Observer{
    private String name;

    public PoliceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String even) {
        System.out.println(name+"警察收到消息，罪犯正在"+even);
    }
}
