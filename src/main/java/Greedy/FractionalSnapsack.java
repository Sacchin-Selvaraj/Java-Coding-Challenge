package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalSnapsack {

    public static void main(String[] args) {
        int[][] weights={
                {100,20},
                {60,10},
                {100,50},
                {200,50}
        };
        int weight=90;
        System.out.println(findMaximumWeight(weights,weight));
    }

    private static double findMaximumWeight(int[][] weights, int weight) {
        int n=weights.length;
        int i=0;
        double totalWeight=0;
        Arrays.sort(weights, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                double a1=(double) o1[0]/o1[1];
                double b1=(double) o2[0]/o2[1];
                return Double.compare(b1,a1);
            }
        });
        System.out.println(Arrays.deepToString(weights));
        while (weight!=0){
            if (weights[i][1]<=weight){
                weight=weight-weights[i][1];
                totalWeight+=weights[i][0];
                i++;
            }else {
                totalWeight+=((double) weights[i][0] /weights[i][1])*weight;
                break;
            }
        }
        return totalWeight;
    }
}