package AdaptorMethod.examples;

public class Forwards extends Player {
    Forwards(String name) {
        super(name);
    }

    @Override
    public void Defense() {
        System.out.println("Forwards,"+name+","+"Defense!");
    }

    @Override
    public void Attack() {
        System.out.println("Forwards,"+name+","+"Attack!");
    }
}
