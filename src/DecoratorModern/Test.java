package DecoratorModern;

public class Test {
    public static void main(String[] args) {
        Person xc = new Person("小陈");
        DecoratorShoes shoes = new DecoratorShoes();
        DecoratorJeans jeans = new DecoratorJeans();
        DecoratorShirt shirt = new DecoratorShirt();
        shoes.Decorate(xc);
        jeans.Decorate(shoes);
        shirt.Decorate(jeans);
        shirt.show();

    }
}
