package SimpleFactory;
/*public class Client {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}*/


public class Client {
    public static void main(String[] args) {
        Operation operation = SimpleOperationFactory.createOperation("+");
        operation.setNumberA(1.5);
        operation.setNumberB(1.2);
        double res = operation.getResult();
        System.out.println(res);

    }

}
