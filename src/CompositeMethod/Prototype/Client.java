package CompositeMethod.Prototype;

public class Client {
    public static void main(String[] args) {
    Composite root = new Composite("root");
    root.Add(new Leaf("Leaf A"));
    root.Add(new Leaf("Leaf B"));
    //根节点上生成树枝节点
    Composite compositeX = new Composite("Composite X");
    compositeX.Add(new Leaf("Leaf XA"));
    compositeX.Add(new Leaf("Leaf XB"));
    root.Add(compositeX);
    //树枝节点上又生成树枝节点
    Composite compositeXX = new Composite("Composite XX");
    compositeXX.Add(new Leaf("Leaf XXA"));
    compositeXX.Add(new Leaf("Leaf XXB"));
    compositeX.Add(compositeXX);
    //根节点上生成叶节点
    root.Add(new Leaf("Leaf C"));
    Leaf leafD = new Leaf("Leaf D");
    root.Add(leafD);
    root.Remove(leafD);
    root.Display(1);
    }
}
