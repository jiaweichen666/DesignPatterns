package FlyweightMethod.Prototype;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight State:"+extrinsicState);
    }
}
