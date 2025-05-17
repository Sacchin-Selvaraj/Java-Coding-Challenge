package BinarySearch;

import static BinarySearch.KokoBananas.findMax;

public class MinimumBouquets {

    public static int minDays(int[] bloomDay, int m, int k) {
        if (m*k >= bloomDay.length) return -1;
        int low=0;
        int high=findMax(bloomDay);
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;

            if (bouquetDays(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }else
                low=mid+1;

        }
        return ans;
    }

    private static boolean bouquetDays(int[] bloomDay, int m, int k, int mid) {
        int ans=0,temp=0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (mid>=bloomDay[i]){
                temp++;
            }else{
                temp=0;
            }
            if (temp==k){
                ans++;
                temp=0;
            }
        }
        return ans>=m;
    }

    public static void main(String[] args) {

        int[] bloomDay={1000000000,1000000000};
        int m=1,k=1;
        System.out.println(minDays(bloomDay,m,k));
    }
}
