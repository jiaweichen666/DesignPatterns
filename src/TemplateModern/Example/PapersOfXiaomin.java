package TemplateModern.Example;

public class PapersOfXiaomin extends Papers {
    @Override
    public void answerOfQuestion1() {
        System.out.println("1");
    }

    @Override
    public void answerOfQuestion2() {
        System.out.println("2");
    }

    @Override
    public void answerOfQuestion3() {
        System.out.println("3");
    }

    @Override
    public void submmitAnswers() {
        question1();
        answerOfQuestion1();
        question2();
        answerOfQuestion2();
        question3();
        answerOfQuestion3();
    }
}
