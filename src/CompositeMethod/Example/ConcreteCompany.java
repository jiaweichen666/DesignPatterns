package CompositeMethod.Example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    public ConcreteCompany(String name) {
        super(name);
    }

    private List<Company> list = new ArrayList<>();
    @Override
    public void AddCompany(Company company) {
        list.add(company);
    }

    @Override
    public void RemoveCompany(Company company) {
        list.remove(company);
    }

    @Override
    public void Display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <depth ; i++) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder)+name);
        int chilrenDepth = depth+2;
        for (Company c:list
             ) {
            c.Display(chilrenDepth);
        }
    }

    @Override
    public void PerformDuty() {
        for (Company company:list
             ) {
            company.PerformDuty();
        }
    }
}
