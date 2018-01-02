package FlyweightMethod.Prototype;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> flyweightMap;
    FlyweightFactory(){
        flyweightMap = new HashMap<>();
    }
    public Flyweight getFlyweight(String key){
        if (flyweightMap.containsKey(key)){
            return flyweightMap.get(key);
        }else{
            flyweightMap.put(key,new ConcreteFlyweight());
            return flyweightMap.get(key);
        }
    }
}
