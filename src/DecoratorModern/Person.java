package DecoratorModern;

public class Person {
    public Person(){}//这个构造方法不写的话无法初始化
    public Person(String name){
        this.name = name;
    }
    public String name;
    public void show(){
        System.out.println("装扮的"+name);
    }
}
