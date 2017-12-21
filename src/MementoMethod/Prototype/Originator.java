package MementoMethod.Prototype;

public class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public Memento CreateMemonto(){
        return new Memento(state);
    }
    public void SetMemento(Memento memento){
        this.state = memento.getState();
    }
    public void show(){
        System.out.println(state);
    }
}
