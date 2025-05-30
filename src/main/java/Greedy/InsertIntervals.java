package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
    private static List<int[]> insertIntervals(int[][] intervals, int[] insert) {
        // not working properly
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1]>insert[0]){
                if (intervals[i][0]>insert[1]){
                    list.add(insert);
                }else {
                    intervals[i][0]=Math.min(insert[0],intervals[i][0]);
                    intervals[i][1]=Math.max(insert[1],intervals[i][1]);
                }
            }
            list.add(intervals[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] intervals={
                {1,2},
                {3,4},
                {6,7},
                {8,10},
                {12,16},
        };
        int[] insert={5,8};
        for (int[] arr:insertIntervals(intervals,insert)){
            System.out.println(Arrays.toString(arr));
        }

        for (int[] arr:insertIntervalsOptimal(intervals,insert)){
            System.out.println(Arrays.toString(arr));
        }

    }

    private static List<int[]> insertIntervalsOptimal(int[][] intervals, int[] insert) {
        // Optimal Solution
        List<int[]> list=new ArrayList<>();
        int i=0;
        while (intervals[i][1]<insert[0]){
            list.add(intervals[i]);
            i++;
        }
        while (insert[1]>=intervals[i][0]){
            insert[0]=Math.min(insert[0],intervals[i][0]);
            insert[1]=Math.max(insert[1],intervals[i][1]);
            i++;
        }
        list.add(insert);
        while (i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
        return list;
    }


}
