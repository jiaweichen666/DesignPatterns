package FlyweightMethod.Examples;

public abstract class Blog {
    protected String name;
    Blog(String name){
        this.name = name;
    }
    public abstract void ShowUser(User user);
}
