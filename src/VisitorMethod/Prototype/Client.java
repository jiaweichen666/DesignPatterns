package VisitorMethod.Prototype;

public class Client {
    public static void main(String[] args) {
        /*访问者模式将数据结构和作用于数据结构上的操作解耦，使得操作易于演变
        * 优点：能较简单的增加操作，符合开闭原则
        * 缺点：很难增加数据结构
        * 适用场合：适合数据结构相对稳定但是作用在其上的操作易于变化的场合*/
        /*ConcreteVIstor1 visit ConcreteElementA
          ConcreteVIstor1 visit ConcreteElementB
          ConcreteVisitor2 visit ConcreteElementA
          ConcreteVisitor2 visit ConcreteElementB*/
        ObejectStructure obejectStructure = new ObejectStructure();
        obejectStructure.Attach(new ConcreteElementA());
        obejectStructure.Attach(new ConcreteElementB());
        ConcreteVIstor1 concreteVIstor1 = new ConcreteVIstor1();
        ConcreteVisitor2 concreteVIstor2 = new ConcreteVisitor2();
        obejectStructure.Accept(concreteVIstor1);
        obejectStructure.Accept(concreteVIstor2);
    }
}
