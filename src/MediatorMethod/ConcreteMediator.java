package MediatorMethod;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague == concreteColleague1){
            concreteColleague2.Notify(message);
        }else{
            concreteColleague1.Notify(message);
        }
    }
}
