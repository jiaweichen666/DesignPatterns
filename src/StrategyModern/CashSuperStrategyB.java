package StrategyModern;

public class CashSuperStrategyB extends CashSuper {
    @Override
    public double getResult(double money) {
        return money*0.8;
    }
}
