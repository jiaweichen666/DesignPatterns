package ChainOfResponsibilityMethod.Prototype;

public abstract class Handler {
    protected Handler handler;
    public abstract void HandleRequest(int request);
    public abstract void SetSuccessor(Handler handler);
}
