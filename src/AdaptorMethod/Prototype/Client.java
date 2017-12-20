package AdaptorMethod.Prototype;

public class Client {
    public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Target target = new Adaptor(adaptee);
    target.Request();
    }

}
