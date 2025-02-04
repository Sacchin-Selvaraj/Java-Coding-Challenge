package Java_Program;

import java.util.ArrayDeque;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        ArrayDeque<Integer> gas1=new ArrayDeque<>();
        ArrayDeque<Integer> cost1=new ArrayDeque<>();
        for (int i = 0; i < gas.length; i++) {
            gas1.add(gas[i]);
            cost1.add(cost[i]);
        }
        int res=0;
        for (int i = 0; i < gas.length; i++) {
            if(gas1.peek()-cost1.peek()<0){
                int temp=gas1.poll();
                gas1.addLast(temp);
                temp=cost1.poll();
                cost1.addLast(temp);
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
