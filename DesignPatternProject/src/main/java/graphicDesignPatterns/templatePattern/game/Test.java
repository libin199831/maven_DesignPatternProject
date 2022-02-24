package graphicDesignPatterns.templatePattern.game;

public class Test {
    public static void main(String[] args) {
        Game game=null;
        game=new Cricket();
        game.play();
        System.out.println("----------------------------------");

        Game game1=new FootBall();
        game1.play();

    }
}
