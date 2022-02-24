package graphicDesignPatterns.templatePattern.game;

public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println("初始化football游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始football游戏");
    }

    @Override
    void endGame() {
        System.out.println("结束football游戏");
    }
}
