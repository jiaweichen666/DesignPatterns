package Command.Examples;

public class Icecream extends Order {
    public Icecream(Chef chef) {
        super(chef);
    }

    @Override
    public void MakeFood() {
        chef.GetSomeIcecream();
    }
}
