package AbstractFactoryMethod.BetterModifiedEdition;

public class AccessDepartment implements DepartmentOperator {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("Insert a department into Access database!");

    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("Get a department from Access database by id!");
        return null;
    }
}
