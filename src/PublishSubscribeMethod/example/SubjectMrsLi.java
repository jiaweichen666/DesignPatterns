package PublishSubscribeMethod.example;

public class SubjectMrsLi extends Subject {
    private String action;
    @Override
    public void setSubjectState(String subjectState) {
        this.action = subjectState;
    }

    @Override
    public String getSubjectState() {
        return action;
    }
}
