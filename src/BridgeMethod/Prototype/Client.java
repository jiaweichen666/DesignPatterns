package BridgeMethod.Prototype;

public class Client {
    public static void main(String[] args) {
    Abstraction abstraction = new RefinedAbstraction();
    abstraction.SetImplementor(new ConcreteImplementorA());
    abstraction.Operation();
    abstraction.SetImplementor(new ConcreteImplementorB());
    abstraction.Operation();
    }
}
