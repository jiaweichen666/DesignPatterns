package DynamicProxy;

public class RealSuject implements  Subject{
    @Override
    public void doSomething() {
        System.out.println("Call DoSomething()!");
    }
}
