package structuralPattern.compositePattern;

public abstract class Component {
    //职位
    private String position;
    //工作
    private String job;

    public Component(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void work(){
        System.out.println("我是"+position+", 我在"+job);
    }

    abstract void addComponent(Component component);
    abstract void removeComponent(Component component);
    abstract void check();

}
