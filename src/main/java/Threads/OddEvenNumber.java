package Threads;

public class OddEvenNumber {

    static int num=1;
    static final int limit = 10;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(OddEvenNumber::printOddNumber,"Odd Thread");
        Thread t2 = new Thread(OddEvenNumber::printEvenNumber,"Even Thread");

        t1.start();
        t2.start();

        t2.join();

        System.out.println("Printed the Numbers");
    }

    public synchronized static void printOddNumber(){
        while (num<=limit){
            while (num%2==0){
                try {
                    OddEvenNumber.class.wait();
                } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
                }
            }
            if (num<=limit) {
                System.out.println(Thread.currentThread().getName() + " : " + num++);
            }

            OddEvenNumber.class.notifyAll();
        }
    }

    public synchronized static void printEvenNumber(){
        while (num<=limit){
            while (num%2!=0){
                try {
                    OddEvenNumber.class.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (num<=limit) {
                System.out.println(Thread.currentThread().getName() + " : " + num++);
            }

            OddEvenNumber.class.notifyAll();

        }
    }
}
