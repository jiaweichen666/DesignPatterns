package ChainOfResponsibilityMethod.Examples;

public class GeneralManager extends Staff {
    @Override
    public void HandleRquest(Request request) {
        String name = request.getRequestName();
        int num = request.getRequestNum();
        if (name.equals("leave") && num<=10){
            System.out.println("Ask for leave for "+ num +" days,Accept!");
        }else if(name.equals("salary") && num<=500){
            System.out.println("Ask for adding salary for "+ num +" dolors,Accept!");
        }else if (name.equals("salary") && num<=1000){
            System.out.println("Ask for adding salary for "+ num +" dolors,Emmm...We can talk about this later...");
        }else {
            System.out.println("Ask for adding salary for "+ num +" dolors,Emmm...NO WAY!!!!");
        }
    }
}
