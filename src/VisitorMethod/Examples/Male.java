package VisitorMethod.Examples;

public class Male extends People {
    @Override
    public void Accept(State state) {
     state.VisitMale(this);
    }
}
