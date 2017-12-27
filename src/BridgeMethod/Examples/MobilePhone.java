package BridgeMethod.Examples;

public abstract class MobilePhone {
    protected Function function;
    public void setFunction(Function function){
        this.function = function;
    }
    public  abstract void operation();
}
