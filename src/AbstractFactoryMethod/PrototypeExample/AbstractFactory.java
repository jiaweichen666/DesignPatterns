package AbstractFactoryMethod.PrototypeExample;

public interface AbstractFactory {
    public UserOperator createUser();
    public DepartmentOperator createDepartment();
}
