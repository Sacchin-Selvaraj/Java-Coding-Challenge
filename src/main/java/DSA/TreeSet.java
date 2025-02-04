package DSA;

class myThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class TreeSet {

    public static void main(String[] args) {

        myThread obj=new myThread();

        myThread obj2=new myThread();
        obj2.run();


    }
}
