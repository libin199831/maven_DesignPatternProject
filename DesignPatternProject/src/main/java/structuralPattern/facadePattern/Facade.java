package structuralPattern.facadePattern;

public class Facade {
    public void open(){
        Browser.open();
        IDE.open();
        WeChat.open();
    }
    public void close(){
        Browser.close();
        IDE.close();
        WeChat.close();
    }
}
