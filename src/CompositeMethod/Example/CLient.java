package CompositeMethod.Example;

public class CLient {
    public static void main(String[] args) {
        ConcreteCompany beijingHeadquater = new ConcreteCompany("北京总部");
        beijingHeadquater.AddCompany(new PersonnelDepartment("北京总部人力资源部"));
        beijingHeadquater.AddCompany(new FinanceDepartment("北京总部财务部"));
        ConcreteCompany shanghaiSubcompany = new ConcreteCompany("上海华东分部");
        shanghaiSubcompany.AddCompany(new PersonnelDepartment("上海分部人力资源部"));
        shanghaiSubcompany.AddCompany(new FinanceDepartment("上海分部财务部"));
        beijingHeadquater.AddCompany(shanghaiSubcompany);
        ConcreteCompany nanjingAgency = new ConcreteCompany("南京办事处");
        nanjingAgency.AddCompany(new PersonnelDepartment("南京办事处人力资源部"));
        nanjingAgency.AddCompany(new FinanceDepartment("南京办事处财务部"));
        ConcreteCompany hangzhouAgency  = new ConcreteCompany("杭州办事处");
        hangzhouAgency.AddCompany(new PersonnelDepartment("杭州办事处人力资源部"));
        hangzhouAgency.AddCompany(new FinanceDepartment("杭州办事处财务部"));
        shanghaiSubcompany.AddCompany(nanjingAgency);
        shanghaiSubcompany.AddCompany(hangzhouAgency);
        beijingHeadquater.Display(1);
        System.out.println("_____________________________");
        beijingHeadquater.PerformDuty();
    }
}
