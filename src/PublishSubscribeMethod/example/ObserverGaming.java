package PublishSubscribeMethod.example;

public class ObserverGaming extends Observer {
    private String name;
    private String newState;
    private Subject subject;
    ObserverGaming(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }
    @Override
    public void update() {
        newState = subject.getSubjectState();
        System.out.println(newState+","+name+","+"不要玩游戏啦！");
    }
}
