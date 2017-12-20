package AdaptorMethod.examples;

public class Center extends Player {
    Center(String name) {
        super(name);
    }

    @Override
    public void Defense() {
        System.out.println("Center,"+name+","+"Defense!");
    }

    @Override
    public void Attack() {
        System.out.println("Center,"+name+","+"Attack!");
    }
}
