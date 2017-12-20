package PrototypeModern.DeepCopy;

import java.io.Serializable;

public class Information implements Serializable{
    private String company;
    private String time;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Information(String company, String time) {
        this.company = company;
        this.time = time;

    }
}
