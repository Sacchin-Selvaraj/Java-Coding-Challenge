package Threads;

public class NoThreads {

    public static void main(String[] args) {
        Task task=new Task();
        task.run();
    }
}

class Task{
    public void run(){
        long time=System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.println("Number : "+i);
        }
        System.out.println(System.currentTimeMillis()-time);
    }
}
