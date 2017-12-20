package StrategyModern;

public class CashSuperStrategyC extends CashSuper {
    @Override
    public double getResult(double money) {
        double result = 0;
        if (money>=300){
            result = money-(money/300)*100;
        }
        return  result;
    }
}
