package ProxyModern;

public class Xiaochen implements Actions {
    private Girl girl;
    public  Xiaochen(Girl girl){
        this.girl = girl;
    }
    @Override
    public void GiveDolls() {
        System.out.println("送娃娃给"+girl.getName());
    }

    @Override
    public void GiveChocolates() {
        System.out.println("送巧克力给"+girl.getName());

    }

    @Override
    public void GiveFlowers() {
        System.out.println("送花给"+girl.getName());
    }
}
