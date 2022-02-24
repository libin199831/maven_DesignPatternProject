package graphicDesignPatterns.templatePattern.game;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("初始化Cricket游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始Cricket游戏");
    }

    @Override
    void endGame() {
        System.out.println("结束Cricket游戏");
    }
}
