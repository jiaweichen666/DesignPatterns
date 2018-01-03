package VisitorMethod.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ObejectStructure {
    List<Element> elements = new ArrayList<>();
    public void Attach(Element element){
        elements.add(element);
    }
    public void Detach(Element element){
        elements.remove(element);
    }
    public void Accept(Visitor visitor){
        for (Element e :elements) {
            e.Accept(visitor);
        }
    }
}
