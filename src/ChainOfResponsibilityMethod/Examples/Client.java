package ChainOfResponsibilityMethod.Examples;

public class Client {
    public static void main(String[] args) {
        Request request1 = new Request("leave",1);
        Request request2 =  new Request("leave",4);
        Request request3  = new Request("salary",499);
        Request request4  = new Request("salary",700);
        Request request5  = new Request("salary",4999);
        Staff commonManager = new CommonManager();//经理
        Staff majordomo = new Majordomo();//总监
        Staff generalManager  = new GeneralManager();//总经理
        commonManager.SetSuperior(majordomo);
        majordomo.SetSuperior(generalManager);
        //开始处理请求
        commonManager.HandleRquest(request1);
        commonManager.HandleRquest(request2);
        commonManager.HandleRquest(request3);
        commonManager.HandleRquest(request4);
        commonManager.HandleRquest(request5);
    }
}
