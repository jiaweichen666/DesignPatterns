package AdaptorMethod.examples;

public class Translator extends Player {
    private Guards guards = new Guards("Yao");
    Translator(String name) {
        super(name);
    }

    @Override
    public void Defense() {
        guards.fangshou();
    }

    @Override
    public void Attack() {
        guards.jingong();

    }
}
