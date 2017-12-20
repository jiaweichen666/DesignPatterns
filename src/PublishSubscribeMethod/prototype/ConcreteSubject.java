package PublishSubscribeMethod.prototype;

public class ConcreteSubject extends Subject {
    private String SubjectState;

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
