package PrototypeModern.ShallowCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype1 = new ConcretePrototype();
        ConcretePrototype concretePrototype2 = (ConcretePrototype) concretePrototype1.clone();
        concretePrototype2.information.setName("qiao");
        concretePrototype1.show();
        concretePrototype2.show();
    }



}
