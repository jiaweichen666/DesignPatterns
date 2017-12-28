package ChainOfResponsibilityMethod.Examples;

public class Request {
    private String requestName;
    private int requestNum;

    public String getRequestName() {
        return requestName;
    }

    public int getRequestNum() {
        return requestNum;
    }

    public Request(String requestName, int requestNum) {
        this.requestName = requestName;
        this.requestNum = requestNum;
    }
}
