package CompositeMethod.Example;

public class FinanceDepartment extends Company {
    @Override
    public void AddCompany(Company company) {
        System.out.println("Cannot add!");
    }

    @Override
    public void RemoveCompany(Company company) {
        System.out.println("Cannot remove!");
    }

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void Display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <depth ; i++) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder)+name);
    }

    @Override
    public void PerformDuty() {
        System.out.println(name+",发放工资！");
    }
}
