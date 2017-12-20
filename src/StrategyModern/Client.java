package StrategyModern;
/*策略模式封装了策略的变化*/

public class Client {
    public static void main(String[] args) {
        String  strategy = "C";
        Context context = new Context(strategy);
        double result = context.getResult(900);
        System.out.println(result);

    }
}
