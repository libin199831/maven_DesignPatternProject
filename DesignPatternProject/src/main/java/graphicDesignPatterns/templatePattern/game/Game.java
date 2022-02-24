package graphicDesignPatterns.templatePattern.game;

public abstract class Game {
    public void play(){
        initialize();

        startGame();

        endGame();
    }

    abstract void initialize();
    abstract void startGame();
    abstract void endGame();
}
