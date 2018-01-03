package VisitorMethod.Examples;

public class Female extends People {
    @Override
    public void Accept(State state) {
     state.VisitFemale(this);
    }
}
