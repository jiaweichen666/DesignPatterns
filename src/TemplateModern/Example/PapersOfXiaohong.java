package TemplateModern.Example;

public class PapersOfXiaohong extends Papers {
    @Override
    public void answerOfQuestion1() {
        System.out.println("4");
    }

    @Override
    public void answerOfQuestion2() {
        System.out.println("5");
    }

    @Override
    public void answerOfQuestion3() {
        System.out.println("6");
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
