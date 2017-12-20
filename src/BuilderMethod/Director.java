package BuilderMethod;

public class Director {
    public static void construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
        builder.BuildPartC();
    }
}
