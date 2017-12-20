package TemplateModern.Example;

public class Client {
    public static void main(String[] args) {
        Papers papers;
        papers = new PapersOfXiaomin();
        papers.submmitAnswers();
        papers = new PapersOfXiaohong();
        papers.submmitAnswers();
    }
}
