package AbstractFactoryMethod.PrototypeExample;

public class AccessFactory implements AbstractFactory {
    @Override
    public UserOperator createUser() {
        return new AccessUser();
    }

    @Override
    public DepartmentOperator createDepartment() {
        return new AccessDepartment();
    }
}
