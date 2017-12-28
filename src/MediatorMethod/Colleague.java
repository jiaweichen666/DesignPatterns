package MediatorMethod;

public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void Send(String message);
    public abstract void Notify(String message);
}
