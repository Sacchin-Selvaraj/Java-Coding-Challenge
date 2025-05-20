package Arrays;


import java.util.Arrays;

public class QueueImpl {
    int[] queue;
    int start;
    int end;
    int size;
    int currentSize=0;
    public QueueImpl(int num) {
        queue=new int[num];
        start=-1;
        end=-1;
        size=num;
    }
    public void add(int num){
        if (currentSize==size){
            System.out.println("Queue is Full");
            return;
        }
        start=++start%size;
        queue[start]=num;
        currentSize++;
    }
    public int pop(){
        if (currentSize==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        end=++end%size;
        int temp=queue[end];
        queue[end]=0;
        currentSize--;
        return temp;
    }
    public int peek(){
        if (currentSize==0){
            System.out.println("Queue is empty....");
            return -1;
        }
        if (end<0)
            return queue[0];
        return queue[end];
    }
    public void show(){
        System.out.println(Arrays.toString(queue));
    }

    public static void main(String[] args) {
        QueueImpl q1=new QueueImpl(5);
        q1.peek();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println(q1.peek());
        System.out.println(q1.pop());
        q1.add(4);
        q1.show();
    }
}
