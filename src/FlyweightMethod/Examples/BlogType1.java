package FlyweightMethod.Examples;

public class BlogType1 extends Blog {
    BlogType1(String name) {
        super(name);
    }

    @Override
    public void ShowUser(User user) {
            System.out.println("This "+name+" blog belongs to "+user.getName());
    }
}
