package patterns.creational.singleton;

public class SingletonApiExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);

        if(runtime == anotherRuntime) {
            System.out.println("They are the same instance");
        }
    }
}
