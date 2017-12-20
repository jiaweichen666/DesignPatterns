package Factory;

public class FactoryDiv implements AbstractFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
