package VisitorMethod.Examples;

public class Failure extends State {
    @Override
    public void VisitMale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" get a "+this.getClass().getSimpleName()+",He just drink without a word.");

    }

    @Override
    public void VisitFemale(People people) {
        System.out.println("When a "+people.getClass().getSimpleName()+" get a "+this.getClass().getSimpleName()+",She just cry,nobody can comfort her.");

    }
}
