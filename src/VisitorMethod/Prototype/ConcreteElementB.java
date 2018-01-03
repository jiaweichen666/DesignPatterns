package VisitorMethod.Prototype;

public class ConcreteElementB extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }
    public void OperationB(){
        System.out.println("Some other relevent functions.");
    }
}
