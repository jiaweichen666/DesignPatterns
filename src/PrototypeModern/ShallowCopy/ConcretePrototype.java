package PrototypeModern.ShallowCopy;

public class ConcretePrototype extends Prototype {
    public void show(){
        System.out.println("Hello Monday!");
        System.out.println(information.getName());
        System.out.println(information.getAge());
    }
}
