package graphicDesignPatterns.interpreterPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Variable,Integer> map=new HashMap<>();

    public void assign(Variable var,Integer integer){
        map.put(var,integer);
    }

    public Integer getValue(Variable var){
        return map.get(var);
    }
}
