package AbstractFactoryMethod.BetterModifiedEdition;

public class SqlServerUser implements UserOperator {
    @Override
    public void insert(User user) {
        System.out.println("Insert a user to SqlServer Database!");
    }

    @Override
    public User getUser(int id) {
        System.out.println("Get a user from SqlServer Database by Id!");
        return null;
    }
}
