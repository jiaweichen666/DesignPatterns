package BuilderMethod;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        Director.construct(builder1);
        Director.construct(builder2);
        Product product1 = builder1.getResult();
        Product product2 = builder2.getResult();
        product1.show();
        System.out.println("________________________");
        product2.show();
    }
}
