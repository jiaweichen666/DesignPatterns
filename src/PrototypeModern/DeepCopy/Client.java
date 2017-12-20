package PrototypeModern.DeepCopy;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        Prototype prototype1 = new Prototype("chen","20");
        Prototype prototype2 = (Prototype) Client.deepClone(prototype1);
        System.out.println("Afer Copy:");
        prototype1.disPlay();
        prototype2.disPlay();
        System.out.println("------------------------------");
        prototype2.setName("shen");
        prototype2.getInformation().setCompany("Tecent");
        prototype2.getInformation().setTime("2001-2010");
        System.out.println("After prototype2's modify:");
        prototype1.disPlay();
        prototype2.disPlay();
    }
    public static Object deepClone(Object src){
        Object o = null;
        try {
            if (src!= null){
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oops = new ObjectOutputStream(baos);
                oops.writeObject(src);
                oops.close();
                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                ObjectInputStream oips = new ObjectInputStream(bais);
                o = oips.readObject();
                oips.close();
            }
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
