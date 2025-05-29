package Greedy;

import java.util.Arrays;

public class NMeetingRoom {

    public static int maxMeetings(int[] start, int[] end) {
        int[][] meetGrid=new int[start.length][3];
        for (int i = 0; i < end.length; i++) {
            meetGrid[i][0]=start[i];
            meetGrid[i][1]=end[i];
            meetGrid[i][2]=i;
        }
        Arrays.sort(meetGrid,(a, b)->
                a[1]-b[1]);
        System.out.println(Arrays.deepToString(meetGrid));
        int lastMeetTime=meetGrid[0][1];
        int meetingCount=1;
        for (int i = 1; i < meetGrid.length; i++) {
            if (lastMeetTime<meetGrid[i][0]){
                lastMeetTime=meetGrid[i][1];
                meetingCount++;
            }
        }
        return meetingCount;
    }
    public static void main(String[] args) {
        int[] start={1, 3, 0, 5, 8, 5};
        int[] end={2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start,end));
    }
}
