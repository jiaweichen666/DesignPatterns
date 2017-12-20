package AdaptorMethod.examples;

public class Client {
    public static void main(String[] args) {
    Player f = new Forwards("Jack");
    Player c = new Center("Rose");
    Player t = new Translator("translaptor");
        f.Attack();
        c.Defense();
        t.Attack();
        t.Defense();
    }
}
