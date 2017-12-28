package MediatorMethod;


public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Send(String message) {
     mediator.Send(message,this);
    }

    @Override
    public void Notify(String message) {
        System.out.println("C1 get message: "+message);
    }
}
