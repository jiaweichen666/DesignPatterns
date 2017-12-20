package Factory;

public class FactoryMul implements AbstractFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
