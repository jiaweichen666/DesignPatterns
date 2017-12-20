package BuilderMethod;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.addPart("part c.");
    }

    @Override
    public void BuildPartB() {
        product.addPart("part d.");
    }

    @Override
    public void BuildPartC() {
        product.addPart("part e.");
    }

    @Override
    public Product getResult() {

        return product;
    }
}
