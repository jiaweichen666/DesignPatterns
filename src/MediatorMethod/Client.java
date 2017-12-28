package MediatorMethod;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator  = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);
        colleague1.Send("Have you eat?");
        colleague2.Send("No,together?");
    }
}
