package SimpleFactory;

public class SimpleOperationFactory {
    public static Operation createOperation(String operator){
        Operation opr = null;
        switch (operator){
            case "+":
                opr = new OperationAdd();
                break;
            case "-":
                opr = new OperationSub();
                break;
            case "*":
                opr = new OperationMul();
                break;
            case "/":
                opr = new OperationDiv();
                break;
        }
        return opr;
    }
}
