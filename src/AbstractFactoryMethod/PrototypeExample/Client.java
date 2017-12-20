package AbstractFactoryMethod.PrototypeExample;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        AbstractFactory factory = new AccessFactory();//假设需要换成Access数据库只需要修改这一句
        UserOperator userOperator = factory.createUser();
        DepartmentOperator departmentOperator = factory.createDepartment();
        userOperator.insert(user);
        userOperator.getUser(1);
        departmentOperator.insertDepartment(department);
        departmentOperator.getDepartment(1);
    }
}
