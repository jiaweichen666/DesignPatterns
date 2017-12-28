package Command.Prototype;

public class Invoker {
    protected Command command;
    public void SetCommand(Command command){
        this.command = command;
    }
    public void ExcuteCommand(){
        command.Excute();
    }
}
