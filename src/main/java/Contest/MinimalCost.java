package Contest;

import java.util.Arrays;

public class MinimalCost {
    public static int[] minCosts(int[] cost) {

        if (cost.length==1)
            return new int[]{cost[0]};
        int[] res=new int[cost.length];
        int smallest=cost[0];
        for (int i = 1; i < cost.length; i++) {
            if (cost[i]<smallest){
                smallest=cost[i];
                res[i]=smallest;
            }else {
                res[i]=smallest;
            }
        }
        res[0]=cost[0];
        return res;
    }

    public static void main(String[] args) {
        int[] cost={9,14};
        System.out.println(Arrays.toString(minCosts(cost)));
    }
}
