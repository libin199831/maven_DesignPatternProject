package graphicDesignPatterns.mediatorPattern;

public class Test {
    public static void main(String[] args) {
        User user1=new User("zs");
        User user2=new User("laowang");

        user1.sendMessage("老王,天气不错！！");
        user2.sendMessage("是的，适合钓鱼。");
    }


}
