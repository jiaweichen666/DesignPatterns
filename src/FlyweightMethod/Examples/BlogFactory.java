package FlyweightMethod.Examples;

import java.util.HashMap;
import java.util.Map;

public class BlogFactory {
    private Map<String,Blog> blogMap;
    BlogFactory(){
        blogMap = new HashMap<>();
    }
    public Blog getBlog(String key){
        if (blogMap.containsKey(key)){
            return blogMap.get(key);
        }else {
            blogMap.put(key,new BlogType1(key));
            return blogMap.get(key);
        }
    }
    public int BlogCount(){
        return blogMap.size();
    }
}
