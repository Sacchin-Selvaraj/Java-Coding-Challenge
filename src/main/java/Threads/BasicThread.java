package Threads;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BasicThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new MyTask());
        thread.start();
        MyTask task=new MyTask();
        task.make()

                .thenApply(String::toUpperCase)
                .thenAccept(System.out::println);

        List<Integer> numbers=List.of(1,3,6,8,9,12);

        System.out.println(numbers);

        List<Integer> numberList=new ArrayList<>();

        Map<Integer,Integer> numberMap=new HashMap<>();

        int[] arr=numbers.stream().mapToInt(num->num).toArray();
        System.out.println(numbers.size());
    }

}

class MyTask implements Runnable{

    @Override
    public void run() {
        long time=System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            System.out.println("Number : "+i);
        }
        System.out.println(System.currentTimeMillis()-time);
    }

    public CompletableFuture<String> make(){
        System.out.println("Sacchin");
        return CompletableFuture.supplyAsync(() -> {
            return "Sacchin";
        });
    }
}
