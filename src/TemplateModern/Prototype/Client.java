package TemplateModern.Prototype;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass;
        abstractClass = new ConcreteClass();
        abstractClass.TemplateMethod();
    }
}
