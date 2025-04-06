package Contest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Router {

    Queue<Integer[]> queue;
    int memorylimit;
    public Router(int memoryLimit) {
        queue=new ArrayDeque<>(memoryLimit);
        memorylimit=memoryLimit;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
//        for (Integer[] num:queue){
//            if (Arrays.deepEquals(num,new Integer[]{source,destination,timestamp})){
//                return false;
//            }
//        }
        if (queue.contains(new Integer[]{source,destination,timestamp}))
            return false;
        queue.add(new Integer[]{source, destination, timestamp});
        if (queue.size()>memorylimit)
            queue.poll();
        return true;
    }

    public int[] forwardPacket() {
        if (!queue.isEmpty()){
            return Arrays.stream(queue.poll()).mapToInt(Integer::intValue).toArray();
        }
        return new int[]{};
    }

    public int getCount(int destination, int startTime, int endTime) {
        int count=0;
        for (Integer[] num:queue){
           if (num[1]==destination&&(num[2]>=startTime&&num[2]<=endTime)){
               count++;
           }
        }

        return count;
    }

    public static void main(String[] args) {

        Router router=new Router(3);
        System.out.println(router.addPacket(1,4,90));
        System.out.println(router.addPacket(2,5,90));
        System.out.println(router.addPacket(1, 4, 90));
        System.out.println(router.addPacket(3, 5, 95));
        System.out.println(router.addPacket(4, 5, 105));
        System.out.println(Arrays.toString(router.forwardPacket()));
        System.out.println(router.addPacket(5,2,110));
        System.out.println(router.getCount(5, 100, 110));

    }
}
