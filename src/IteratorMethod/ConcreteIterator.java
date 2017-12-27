package IteratorMethod;

public class ConcreteIterator extends Iterator {
    private ConcreteAggregate concreteAggregate;
    private int current = 0;
    ConcreteIterator(ConcreteAggregate aggregate){
        concreteAggregate = aggregate;
    }
    @Override
    public Object First() {
        return concreteAggregate.get(0);
    }

    @Override
    public Object Next() {
        Object o = null;
        current++;
        if (current < concreteAggregate.getCount()) {
            o = concreteAggregate.get(current);
        }
        return o;
    }

    @Override
    public boolean IsDone() {
        return current >= concreteAggregate.getCount();
    }

    @Override
    public Object CurrentItem() {
        return concreteAggregate.get(current);
    }
}
