package structuralPattern.compositePattern;

import java.util.ArrayList;

public class Manager extends Component{
    private ArrayList<Component> components=new ArrayList<>();

    public Manager(String position, String job) {
        super(position, job);
    }

    @Override
    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    void check() {

        work();
        for(Component component:components){
            System.out.print("  ");
            component.check();
        }

    }
}
