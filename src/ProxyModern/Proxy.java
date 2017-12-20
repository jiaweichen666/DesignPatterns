package ProxyModern;

public class Proxy implements Actions {
    private Xiaochen xiaochen;
    public Proxy(Girl girl){
        xiaochen = new Xiaochen(girl);
    }
    @Override
    public void GiveDolls() {
        xiaochen.GiveDolls();
    }

    @Override
    public void GiveChocolates() {
        xiaochen.GiveChocolates();
    }

    @Override
    public void GiveFlowers() {
        xiaochen.GiveFlowers();
    }
}
