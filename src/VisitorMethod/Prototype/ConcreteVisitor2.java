package VisitorMethod.Prototype;

public class ConcreteVisitor2 extends Visitor {
    @Override
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(this.getClass().getSimpleName()+" visit "+concreteElementA.getClass().getSimpleName());

    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(this.getClass().getSimpleName()+" visit "+concreteElementB.getClass().getSimpleName());

    }
}
