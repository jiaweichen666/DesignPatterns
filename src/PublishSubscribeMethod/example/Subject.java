package PublishSubscribeMethod.example;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
    private List<Observer> list = new ArrayList<>();
    public void Attach(Observer observer){
        list.add(observer);
    }
    public void Dettach(Observer observer){
        list.remove(observer);
    }
    public void Notify(){
        for (Observer o:list
             ) {
            o.update();
        }
    }
    abstract public void setSubjectState(String state);
    abstract public String getSubjectState();
}
