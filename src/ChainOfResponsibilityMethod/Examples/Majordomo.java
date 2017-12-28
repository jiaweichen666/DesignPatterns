package ChainOfResponsibilityMethod.Examples;

public class Majordomo extends Staff {
    @Override
    public void HandleRquest(Request request) {
        String name = request.getRequestName();
        int num = request.getRequestNum();
        if (name.equals("leave") && num<=5){
            System.out.println("Ask for leave for "+ num +" days,Accept!");
        }else{
            staff.HandleRquest(request);
        }
    }
}
