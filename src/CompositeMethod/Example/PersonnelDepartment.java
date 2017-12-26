package CompositeMethod.Example;

public class PersonnelDepartment extends Company {
    @Override
    public void AddCompany(Company company) {
        System.out.println("Cannot Add!");
    }

    @Override
    public void RemoveCompany(Company company) {
        System.out.println("Cannot Remove!");
    }

    @Override
    public void Display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <depth ; i++) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder)+name);
    }

    public PersonnelDepartment(String name) {
        super(name);
    }

    @Override
    public void PerformDuty() {
        System.out.println(name+",招聘职员！");
    }
}
