package AbstractFactoryMethod.BsetModifiedEdition;

import FacadeMethod.Facade;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
        Factory factory  = new Factory();
        User user = new User();
        Department department = new Department();
        UserOperator userOperator = null;
        DepartmentOperator departmentOperator = null;
        userOperator = Factory.CreateUserOperator();
        departmentOperator = Factory.CreateDepartmentOperator();
        userOperator.insert(user);
        userOperator.getUser(1);
        departmentOperator.insertDepartment(department);
        departmentOperator.getDepartment(1);
        factory.getChosenDatabase();
    }
}
