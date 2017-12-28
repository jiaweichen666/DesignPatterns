package Command.Prototype;

public class Client {
    public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Command command = new ConcreteCommand(new Receiver());
    invoker.SetCommand(command);
    invoker.ExcuteCommand();
    }
}