package Singleton;

public class SingletonPattern {
    private static SingletonPattern instance;
    private SingletonPattern() {
    }

    private static SingletonPattern getInstance() {
        if (instance==null)
            instance=new SingletonPattern();
        return instance;
    }
    public static void main(String[] args) {

        SingletonPattern obj1=SingletonPattern.getInstance();
        SingletonPattern obj2=SingletonPattern.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 are the same instance");
        } else {
            System.out.println("obj1 and obj2 are different instances");
        }

    }
}
