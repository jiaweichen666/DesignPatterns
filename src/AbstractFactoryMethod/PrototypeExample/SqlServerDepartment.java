package AbstractFactoryMethod.PrototypeExample;

public class SqlServerDepartment implements DepartmentOperator {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("Insert a department into SqlServer database!");

    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Get a department from SqlServer database by id!");
        return null;
    }
}
