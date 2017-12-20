package Factory;

public class Client {
    public static void main(String[] args) {
    AbstractFactory factory = new FactoryAdd();
    Operation operation = factory.createOperation();
    operation.setNumberA(2.2);
    operation.setNumberB(1.1);
    double result = operation.getResult();
    System.out.println(result);
    }

}
