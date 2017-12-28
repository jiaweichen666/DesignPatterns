package Command.Examples;

public class Humburger extends Order {
    public Humburger(Chef chef) {
        super(chef);
    }

    @Override
    public void MakeFood() {
        chef.GetSomeHumburger();
    }
}
