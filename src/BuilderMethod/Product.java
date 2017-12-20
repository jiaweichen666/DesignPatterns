package BuilderMethod;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<>();
    public void addPart(String part){
        parts.add(part);
    }
    public void show(){
        for (String s:parts) {
            System.out.println(s);
        }
    }
}
