package FlyweightMethod.Prototype;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicState) {
        System.out.println("ConcreteFlyweight State:"+extrinsicState);
    }
}
