package Greedy;

import java.util.Arrays;

public class ShortestJob {

    public static void main(String[] args) {
        int[] jobTime={4,3,7,1,2};
        System.out.println(findShortestJob(jobTime));
    }

    private static int findShortestJob(int[] jobTime) {
        // O(n)+O(n log n)
        Arrays.sort(jobTime);
        int time=0,temp=0;
        for (int i = 0; i < jobTime.length; i++) {
            time+=temp;
            temp=temp+jobTime[i];
        }
        return time/jobTime.length;
    }
}
