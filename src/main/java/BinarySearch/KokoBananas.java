package BinarySearch;


public class KokoBananas {

    public static void main(String[] args) {
        int h = 5;
        int[] piles = {30,11,23,4,20};
        int bananas = minEatingSpeed( piles, h);
        System.out.println(bananas);
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 0;
        int high = findMax(piles);
        while (low <= high) {
            int mid = (low + high) / 2;
            int hours = findHour(piles, mid,h);
             if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int findMax(int[] piles) {
        int max=-1;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i]>max)
                max=piles[i];
        }
        return max;
    }

    private static int findHour(int[] piles, int mid, int h) {

        int totalHrs=0;
        for (int num:piles){
            int hour=num/mid;
            if (num%mid!=0) hour++;
            totalHrs+=hour;
        }
        return totalHrs;
    }
}
