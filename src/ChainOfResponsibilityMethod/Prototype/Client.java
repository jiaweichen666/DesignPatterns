package ChainOfResponsibilityMethod.Prototype;

public class Client {
    public static void main(String[] args) {
        int [] requests = {2,5,12,15,22,25};
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.SetSuccessor(handler2);
        handler2.SetSuccessor(handler3);
        for (int request:requests
             ) {
            handler1.HandleRequest(request);
        }
    }
}
