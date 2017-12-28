package Command.Examples;

public class Coke extends Order {
    public Coke(Chef chef) {
        super(chef);
    }

    @Override
    public void MakeFood() {
        chef.GetSomeCoke();
    }
}
