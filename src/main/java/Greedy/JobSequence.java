package Greedy;

import java.util.Arrays;

public class JobSequence {

    public static int[] jobScheduling(int[][] jobs) {

        Arrays.sort(jobs,(o1, o2) ->
                o2[2]-o1[2]);

        int max=Integer.MIN_VALUE;
        for (int i = 0; i < jobs.length; i++) {
            max=Math.max(max,jobs[i][1]);
        }
        int[] arr=new int[max+1];
        Arrays.fill(arr,-1);
        int counterProfit=0,jobCount=0;
        for (int i = 0; i < jobs.length; i++) {
            int deadLine=jobs[i][1];
            for (int j = deadLine; j > 0 ; j--) {
                if (arr[j]==-1){
                    arr[j]=jobs[i][0];
                    jobCount++;
                    counterProfit+=jobs[i][2];
                    break;
                }
            }
        }

        return new int[]{jobCount,counterProfit};
    }

    public static void main(String[] args) {
        int[][] jobs={
                {1, 2, 100} ,
                {2, 1, 19} ,
                {3, 2, 27} ,
                {4, 1, 25},
                {5, 1, 15}
        };
        System.out.println(Arrays.toString(jobScheduling(jobs)));

    }
}
