package DynamicProxy;

public class Main {
    public static void main(String[] args) {
        ProxyHandler proxy = new ProxyHandler();
        Subject subject = (Subject) proxy.bind(new RealSuject());
        subject.doSomething();
    }
}
