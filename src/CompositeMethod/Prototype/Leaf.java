package CompositeMethod.Prototype;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }
    /*叶节点的Add和Remove方法的实现没有意义，但是实现后可以消除叶节点和树枝结点在抽象层次的区别
    这种实现方式就是透明的实现方式，因为叶节点和树枝节点具有完全一致的行为接口。但是缺点是Leaf实
    现这两个方法是毫无意义的。
    对于安全方式，Component中只声明Display()方法，在Composite类中实现Add和Remove方法
    缺点是在客户端调用时候要去做相应的判断。
     */
    @Override
    public void Add(Component component) {
        System.out.println("This is a leaf,can not Add!");
    }

    @Override
    public void Remove(Component component) {
        System.out.println("This is a leaf,can not Remove!");
    }

    @Override
    public void Display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <depth ; i++) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder)+name);
    }
}
