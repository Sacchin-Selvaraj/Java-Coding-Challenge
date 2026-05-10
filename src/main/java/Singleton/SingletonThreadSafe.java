package Singleton;

import java.util.concurrent.atomic.AtomicReference;

class SingletonDemo{

    private SingletonDemo(){

    }

//    public static SingletonDemo getInstance(){
//
//        if (instance==null){
//            instance=new SingletonDemo();
//        }
//        return instance;
//    }

//    public static SingletonDemo getInstance(){
//        if (instance==null){
//            synchronized (SingletonDemo.class){
//                if (instance==null) {
//                    instance = new SingletonDemo();
//                }
//            }
//        }
//        return instance;
//    }

    private static final class InstanceHolder {
        private static final SingletonDemo instance = new SingletonDemo();
    }

    public static SingletonDemo getInstance(){
        return InstanceHolder.instance;
      }

}
public class SingletonThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        AtomicReference<SingletonDemo> obj0= new AtomicReference<>();
        AtomicReference<SingletonDemo> obj1= new AtomicReference<>();
        AtomicReference<SingletonDemo> obj2= new AtomicReference<>();

        Runnable runnable = ()-> obj0.set(SingletonDemo.getInstance());

        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(()->{
            obj1.set(SingletonDemo.getInstance());
        });

        Thread t2 = new Thread(()->{
            obj2.set(SingletonDemo.getInstance());
        });


        t0.start();
        t1.start();
        t2.start();

        t0.join();
        t1.join();
        t2.join();

        System.out.println(obj1.get());
        System.out.println(obj2.get());

        if (obj1.get() == obj2.get()) System.out.println("Both Address are same");
        else System.out.println("Address are not same");
    }
}
