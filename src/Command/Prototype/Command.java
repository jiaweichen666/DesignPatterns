package Command.Prototype;

public abstract class Command {
    protected Receiver receiver;
    Command(Receiver receiver){
        this.receiver = receiver;
    }
    public abstract void Excute();
}
