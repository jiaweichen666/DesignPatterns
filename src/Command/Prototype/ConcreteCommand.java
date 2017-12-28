package Command.Prototype;

public class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void Excute() {

        receiver.Action();
    }
}
