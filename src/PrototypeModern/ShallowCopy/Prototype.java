package PrototypeModern.ShallowCopy;

public class Prototype implements Cloneable {
        public Information information  = new Information("chen",20);
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        try {

        prototype =(Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
