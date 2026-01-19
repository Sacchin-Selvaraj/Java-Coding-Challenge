package Contest;

import java.util.Arrays;

public class MaximumCapacityWithinBudget {

    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        long res = 0;
        int n = costs.length;
        int[] pref = new int[n];
        int[][] stateMachine = new int[n][2];

        for(int i=0; i<n; i++){
            stateMachine[i][0] = costs[i];
            stateMachine[i][1] = capacity[i];
        }
        Arrays.sort(stateMachine, (x, y) -> Integer.compare(x[0], y[0]));

        pref[0] = stateMachine[0][1];
        for(int i=1; i<n; i++){
            pref[i] = Math.max(pref[i - 1], stateMachine[i][1]);
        }

        for(int i=0; i<n; i++){
            int cost = stateMachine[i][0];
            int cap = stateMachine[i][1];
            if(cost < budget){
                res = Math.max(res, cap);
            }
            int remain = budget - cost;
            int idx = search(stateMachine, i-1, remain);
            if(idx != -1){
                long pc = (long)cap + pref[idx];
                res = Math.max(res, pc);
            }
        }
        return (int)res;
    }

    private static int search(int[][] stateMachine, int right, int x){
        int left = 0;
        int res = -1;
        while(left <= right){
            int m = left + (right - left)/2;
            if(stateMachine[m][0] < x){
                res = m;
                left = m + 1;
            }
            else {
                right = m - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] cost = {4,8,5,3};
        int[] capacity = {1,5,2,7};
        int budget = 8;

        System.out.println(maxCapacity(cost,capacity,budget));
    }
}

