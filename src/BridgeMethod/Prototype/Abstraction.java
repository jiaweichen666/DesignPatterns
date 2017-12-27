package BridgeMethod.Prototype;

public abstract class Abstraction {
    protected Implementor implementor;
    public abstract void Operation();
    public void SetImplementor(Implementor implementor){
        this.implementor = implementor;
    }
}
