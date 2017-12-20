package PublishSubscribeMethod.prototype;

public class ConcreteObserver extends Observer {
        private String name;
        private String observerState;
        private ConcreteSubject concreteSubject;
        ConcreteObserver(String name,ConcreteSubject concreteSubject){
            this.name = name;
            this.concreteSubject = concreteSubject;
        }
    public void Update() {
     observerState = concreteSubject.getSubjectState();
        System.out.println("观察者："+name+"的状态是："+observerState);
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }
}
