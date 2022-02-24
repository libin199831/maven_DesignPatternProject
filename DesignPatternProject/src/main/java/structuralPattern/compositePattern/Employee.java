package structuralPattern.compositePattern;

public class Employee extends Component{

    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void addComponent(Component component) {
        System.out.println("没有权限");
    }

    @Override
    void removeComponent(Component component) {
        System.out.println("没有权限");
    }

    @Override
    void check() {
        System.out.print("  ");
        work();
    }
}
