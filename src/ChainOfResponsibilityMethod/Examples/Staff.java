package ChainOfResponsibilityMethod.Examples;

public abstract class Staff {
    protected Staff staff;
    public abstract void HandleRquest(Request request);
    public  void SetSuperior(Staff staff) {
        this.staff = staff;
    }
}
