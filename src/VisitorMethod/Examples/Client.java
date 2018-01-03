package VisitorMethod.Examples;

public class Client {
    /*
    * When a Male Success,There is a great women back behind.
      When a Female Success,There is a fail man back behind.
      When a Male get a Failure,He just drink without a word.
      When a Female get a Failure,She just cry,nobody can comfort her.
      When a Male FallInLove,he knows everything even if he does not know it.
      When a Female FallInLove,she does not know anything even if she understands it.
    * */
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.Attach(new Male());
        objectStructure.Attach(new Female());
        Success success = new Success();
        Failure failure = new Failure();
        FallInLove fallInLove = new FallInLove();
        objectStructure.Accept(success);
        objectStructure.Accept(failure);
        objectStructure.Accept(fallInLove);
    }
}
