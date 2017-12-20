package StrategyModern;

public class Context {
    CashSuper cashSuper = null;
    public  Context(String strategyType){
        switch (strategyType){
            case "A":
                cashSuper = new CashSuperStrategyA();
                break;
            case "B":
                cashSuper = new CashSuperStrategyB();
                break;
            case "C":
                cashSuper = new CashSuperStrategyC();
                break;
        }
    }
    public  double getResult(double money){
        return cashSuper.getResult(money);
    }
}
