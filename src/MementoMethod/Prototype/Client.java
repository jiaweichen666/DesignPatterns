package MementoMethod.Prototype;

public class Client {
    public static void main(String[] args) {
        //初始化为on
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();
        //创建备忘录
        Memento memento  = originator.CreateMemonto();
        //让caretaker保存备忘录
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        //修改状态
        originator.setState("Off");
        originator.show();
        //加载历史备忘录
        originator.SetMemento(caretaker.getMemento());
        originator.show();
    }
}
