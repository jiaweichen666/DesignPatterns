package PublishSubscribeMethod.prototype;

public class Client {
    public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
      subject.Attach(new ConcreteObserver("chen1",subject));
        subject.Attach(new ConcreteObserver("chen2",subject));
      subject.setSubjectState("A new year");
      subject.Notify();
    }

}
