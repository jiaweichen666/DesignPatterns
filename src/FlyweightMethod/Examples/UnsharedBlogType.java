package FlyweightMethod.Examples;

public class UnsharedBlogType extends Blog {
    UnsharedBlogType(String name) {
        super(name);
    }

    @Override
    public void ShowUser(User user) {
            System.out.println("This "+name+" blog belongs to "+user.getName());
    }
}
