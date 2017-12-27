package SingletonMethod.HungryType;
//饿汉单例模式
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
