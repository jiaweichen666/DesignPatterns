package VisitorMethod.Examples;

public class FallInLove extends State {
    @Override
    public void VisitMale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+",he knows everything even if he does not know it.");
    }

    @Override
    public void VisitFemale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" "+this.getClass().getSimpleName()+",she does not know anything even if she understands it.");
    }
}
