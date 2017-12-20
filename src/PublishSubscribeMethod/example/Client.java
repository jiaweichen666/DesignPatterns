package PublishSubscribeMethod.example;

public class Client {
    public static void main(String[] args) {
        /*client方法中有一个subject和observer相互订阅的过程，observer需要绑定具体的subject，具体的
        subject也要去Attach具体的observer。
         */
        Subject subjectMrsLi = new SubjectMrsLi();
        Observer observer1 = new ObserverGaming("小陈",subjectMrsLi);
        Observer observer2 = new ObserverGambling("chen",subjectMrsLi);
        Observer observer3 = new ObserverGambling("chenjiawei",subjectMrsLi);
        subjectMrsLi.Attach(observer1);
        subjectMrsLi.Attach(observer2);
        subjectMrsLi.Attach(observer3);
        subjectMrsLi.setSubjectState("老板回来啦！");
        subjectMrsLi.Notify();
        System.out.println("-----------------------------------------------");
        Subject subjectBoss = new SubjectBoss();
        Observer observer4 = new ObserverGaming("小陈",subjectBoss);
        Observer observer5 = new ObserverGambling("chen",subjectBoss);
        Observer observer6 = new ObserverGambling("chenjiawei",subjectBoss);
        subjectBoss.Attach(observer4);
        subjectBoss.Attach(observer5);
        subjectBoss.Attach(observer6);
        subjectBoss.setSubjectState("我出差回来了！");
        subjectBoss.Notify();

    }
}
