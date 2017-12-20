package PublishSubscribeMethod.example;

public class ObserverGambling extends Observer {
    private String name;
    private String newState;
    private Subject subject;

    public ObserverGambling(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        newState = subject.getSubjectState();
        System.out.println(newState+","+name+","+"不要打牌啦！");
    }
}
