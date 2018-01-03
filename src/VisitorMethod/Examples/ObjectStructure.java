package VisitorMethod.Examples;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<People> list = new ArrayList<>();
    public void Attach(People people){
        list.add(people);
    }
    public void Detach(People people){
        list.remove(people);
    }
    public void Accept(State state){
        for (People p:list
             ) {
            p.Accept(state);
        }
    }
}
