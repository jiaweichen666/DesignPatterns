package ChainOfResponsibilityMethod.Prototype;

public class ConcreteHandler3 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if (request>=20 && request<30){
            System.out.println(this.getClass().getSimpleName()+"Handled this request!");
        }else {
            handler.HandleRequest(request);
        }
    }

    @Override
    public void SetSuccessor(Handler handler) {
        this.handler = handler;
    }
}
