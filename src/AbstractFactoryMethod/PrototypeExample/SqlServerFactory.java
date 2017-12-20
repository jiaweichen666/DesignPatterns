package AbstractFactoryMethod.PrototypeExample;

public class SqlServerFactory implements AbstractFactory {
    @Override
    public UserOperator createUser() {
        return new SqlserverUser();
    }

    @Override
    public DepartmentOperator createDepartment() {
        return new SqlServerDepartment();
    }
}
