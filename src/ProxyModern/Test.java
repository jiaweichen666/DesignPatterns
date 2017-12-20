package ProxyModern;

public class Test {
    public static void main(String[] args) {
        Girl girl = new Girl("沈茜");
        Proxy proxy = new Proxy(girl);
        proxy.GiveChocolates();
        proxy.GiveFlowers();
        proxy.GiveDolls();

    }
}
