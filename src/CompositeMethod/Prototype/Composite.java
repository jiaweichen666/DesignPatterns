package CompositeMethod.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> list = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void Add(Component component) {
        list.add(component);
    }

    @Override
    public void Remove(Component component) {
        list.remove(component);
    }

    @Override
    public void Display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <depth ; i++) {
            stringBuilder.append("-");
        }
        System.out.println(new String(stringBuilder)+name);
        int childCompositeDepth = depth+2;
        for (Component c:list
             ) {
            c.Display(childCompositeDepth);
        }
    }
}
