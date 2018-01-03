package VisitorMethod.Examples;

public class Success extends State {
    @Override
    public void VisitMale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+",There is a great women back behind.");
    }

    @Override
    public void VisitFemale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+",There is a fail man back behind.");
    }
}
