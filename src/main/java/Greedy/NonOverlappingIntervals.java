package Greedy;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(o1, o2) -> o1[1]-o2[1]);
        int erase=0;
        int lastInterval=intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]<lastInterval){
                erase++;
            }else {
                lastInterval=intervals[i][1];
            }
        }

        return erase;
    }
    public static void main(String[] args) {
        int[][] intervals={
            {1,100},
            {11,22},
            {1,11},
            {2,12}
        };
        System.out.println(eraseOverlapIntervals(intervals));
    }

}
