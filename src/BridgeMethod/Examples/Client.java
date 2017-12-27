package BridgeMethod.Examples;

public class Client {
    /*将抽象部分与它的实现部分分离，使他们都可以独立的变化（GOF）
    即实现系统由多种角度分类且每一种分类都可能变化，把多种角度分离开来，能让他们独立的变化减少耦合。
    运用了组合/复用原则。
    在这个例子里面，将手机品牌和手机功能两个方面分离，可以独立的变化，增加功能或者增加品牌。
     */
    public static void main(String[] args) {
        MobilePhone mobilePhoneA = new MobilephoneA();
        MobilePhone mobilePhoneB = new MobilePhoneB();
        mobilePhoneA.setFunction(new FunctionCall());
        mobilePhoneA.operation();
        mobilePhoneA.setFunction(new FunctionMusicPlay());
        mobilePhoneA.operation();
        mobilePhoneB.setFunction(new FunctionGame());
        mobilePhoneB.operation();
    }
}
