package FlyweightMethod.Examples;

public class Client {
    public static void main(String[] args) {
        BlogFactory blogFactory = new BlogFactory();
        User Jack = new User("Jack");
        User Rose = new User("Rose");
        User Chen = new User("Chen");
        User Damient = new User("Damient");
        Blog blog1 = blogFactory.getBlog("Military Blog");
        Blog blog2 = blogFactory.getBlog("Life share Blog");
        blog1.ShowUser(Jack);
        blog1.ShowUser(Rose);
        blog2.ShowUser(Chen);
        blog2.ShowUser(Damient);
        System.out.println("Total count "+blogFactory.BlogCount());
    }
}
