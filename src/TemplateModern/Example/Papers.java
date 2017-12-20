package TemplateModern.Example;

public abstract class Papers {
    public void question1(){
        System.out.println("1+1=?");
    }
    public void question2(){
        System.out.println("2+2=?");
    }
    public void question3(){
        System.out.println("3+3=?");
    }
    public abstract void answerOfQuestion1();
    public abstract void answerOfQuestion2();
    public abstract void answerOfQuestion3();
    public abstract void submmitAnswers();

}
