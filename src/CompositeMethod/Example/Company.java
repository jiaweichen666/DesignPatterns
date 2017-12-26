package CompositeMethod.Example;
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void AddCompany(Company company);
    public abstract void RemoveCompany(Company company);
    public abstract void Display(int depth);
    public abstract void PerformDuty();
}
