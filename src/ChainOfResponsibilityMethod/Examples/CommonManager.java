package ChainOfResponsibilityMethod.Examples;

public class CommonManager extends Staff {
    @Override
    public void HandleRquest(Request request) {
        if (request.getRequestName()=="leave" && request.getRequestNum()<=2){
            System.out.println("Ask for "+request.getRequestName()+" for "+request.getRequestNum()+" days,Accept!");
        }else {
            staff.HandleRquest(request);
        }
    }

}
