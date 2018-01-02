package FlyweightMethod.Prototype;

public class Client {
    public static void main(String[] args) {
        int extrinsicstate = 10;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("x");
        flyweight1.Operation(--extrinsicstate);
        Flyweight flyweight2  = flyweightFactory.getFlyweight("y");
        flyweight2.Operation(--extrinsicstate);
        Flyweight flyweight3 = new UnsharedConcreteFlyweight();
        flyweight3.Operation(--extrinsicstate);
    }
}
