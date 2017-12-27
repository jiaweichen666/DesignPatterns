package IteratorMethod;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.set(0,"classmate1");
        concreteAggregate.set(1,"classmate2");
        concreteAggregate.set(2,"classmate3");
        concreteAggregate.set(3,"classmate4");
        concreteAggregate.set(4,"classmate5");
        concreteAggregate.set(5,"classmate6");
        concreteAggregate.set(6,"classmate7");
        /*使用迭代器遍历集合*/
        Iterator iterator = concreteAggregate.CreateIterator();
        while (!iterator.IsDone()){
            System.out.println(iterator.CurrentItem());
            iterator.Next();
        }

    }
}
