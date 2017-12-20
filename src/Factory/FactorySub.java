package Factory;

public class FactorySub implements AbstractFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
