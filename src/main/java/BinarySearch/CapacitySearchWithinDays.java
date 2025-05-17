package BinarySearch;

import java.util.Arrays;

public class CapacitySearchWithinDays {

    public static int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high=findTotalWeight(weights);
        while (low<=high){
            int mid=(low+high)/2;
            if (carryWeight(weights,days,mid)){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    private static boolean carryWeight(int[] weights, int days, int shipCapacity) {
        int capacity=0,day=1;
        for (int i = 0; i < weights.length; i++) {
            if (capacity+weights[i]>shipCapacity){
                day++;
                capacity=weights[i];
            }else {
                capacity+=weights[i];
            }
        }
        return day<=days;
    }

    private static int findTotalWeight(int[] weights) {
        int sum=0;
        for (int i = 0; i < weights.length; i++) {
            sum+=weights[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(weights,days));
    }
}
