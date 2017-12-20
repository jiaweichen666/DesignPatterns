package AdaptorMethod.examples;

 public abstract class Player {
    protected   String name;
    Player(String name ){
        this.name = name;
    }
    public abstract void Defense();
    public abstract void Attack();
}
