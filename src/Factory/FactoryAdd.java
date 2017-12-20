package Factory;

public class FactoryAdd implements AbstractFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
