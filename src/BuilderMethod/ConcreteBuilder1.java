package BuilderMethod;

public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.addPart("Part a.");
    }

    @Override
    public void BuildPartB() {
        product.addPart("part b.");
    }

    @Override
    public void BuildPartC() {
        product.addPart("part c.");

    }

    @Override
    public Product getResult() {
        return product;
    }
}
