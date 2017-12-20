package PublishSubscribeMethod.prototype;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {
    private List<Observer> list = new ArrayList<>();
    public void Attach(Observer observer){
        list.add(observer);
    }
    public void  Dettach(Observer observer){
        list.remove(observer);
    }
    public void Notify(){
        for (Observer o:list) {
            o.Update();
        }
    }
}
