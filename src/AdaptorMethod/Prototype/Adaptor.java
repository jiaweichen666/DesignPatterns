package AdaptorMethod.Prototype;

public class Adaptor implements Target {

    private Adaptee adaptee;
    Adaptor(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
