package MediatorMethod;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
    mediator.Send(message,this);
    }

    @Override
    public void Notify(String message) {
        System.out.println("C2 get message:"+message);
    }
}
