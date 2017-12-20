package PrototypeModern.DeepCopy;

import java.io.Serializable;

public class Prototype implements Serializable {
    private String name;
    private String age;
    private Information information = new Information("Baidu","2007-2010");

    public Prototype(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
    public void disPlay(){
        System.out.println(name+" "+age+" | "+information.getCompany()+" "+information.getTime());
    }
}
