package FacadeMethod;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SusSystemFour four;
    Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SusSystemFour();
    }
    public void MethodA(){
        System.out.println("Methods A:");
        one.MethodOne();
        two.MethodTwo();
        three.MethodThree();
    }
    public void MethodB(){
        System.out.println("Methods B:");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }
}
