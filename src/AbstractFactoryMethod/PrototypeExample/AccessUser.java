package AbstractFactoryMethod.PrototypeExample;

public class AccessUser implements UserOperator {
    @Override
    public void insert(User user) {
        System.out.println("Insert an user to Access database!");
    }

    @Override
    public User getUser(int id) {
        System.out.println("Get an user from Access database by id!");
        return null;
    }
}
