package ChainOfResponsibilityMethod.Prototype;

public class ConcreteHandler1 extends Handler {
    @Override
    public void HandleRequest(int request) {
     if (request>=0 && request<10){
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
