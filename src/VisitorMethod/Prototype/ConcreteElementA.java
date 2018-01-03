package VisitorMethod.Prototype;

public class ConcreteElementA extends Element {
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }
    public void OperationB(){
        System.out.println("Some other relevent functions.");
    }
}
