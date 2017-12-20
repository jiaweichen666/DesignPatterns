package AdaptorMethod.examples;

public class Guards {
    private String name;

    public Guards(String name) {
        this.name = name;
    }
    public void jingong(){
        System.out.println("Guards,"+name+","+"Attack!");
    }
    public void fangshou(){
        System.out.println("Guards,"+name+","+"Defense!");
    }
}
