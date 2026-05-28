package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

public class PrintNumbers {

    static int i=1;

    public static void main(String[] args) {

        try(ExecutorService executorService = new ForkJoinPool(11)){
            for (int j = 0; j < 10; j++) {
                executorService.submit(PrintNumbers::printNumber);
            }
        }

    }

    public synchronized static void  printNumber(){
        System.out.println("Thread name :"+Thread.currentThread().getName());


        System.out.println(i++);
    }
}
