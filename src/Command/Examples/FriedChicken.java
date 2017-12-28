package Command.Examples;

public class FriedChicken extends Order {
    public FriedChicken(Chef chef) {
        super(chef);
    }

    @Override
    public void MakeFood() {
        chef.GetSomeChicken();
    }
}
