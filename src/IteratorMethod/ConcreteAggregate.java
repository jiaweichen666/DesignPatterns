package IteratorMethod;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> list = new ArrayList<>();
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    public int getCount(){
        return list.size();
    }
    public Object get(int index){
        return list.get(index);
    }
    public void set(int index,String value){
        list.add(index,value);
    }
}
