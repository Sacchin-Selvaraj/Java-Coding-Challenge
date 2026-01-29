package Threads;

public class BasicThread {

    public static void main(String[] args) throws InterruptedException {
       Thread thread=new Thread(new MyTask());
        thread.start();
    }

}

class MyTask implements Runnable{

    @Override
    public void run() {
        long time=System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.println("Number : "+i);
        }
        System.out.println(System.currentTimeMillis()-time);
    }
}
