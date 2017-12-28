package Command.Examples;

public abstract class Order {
protected Chef chef;
public Order(Chef chef){
    this.chef = chef;
}
public abstract void MakeFood();//菜单给厨师下命令，所以这个是菜单的职责。
}
