package Java_Program;

import java.util.Scanner;

public class MaximumAverageSubArray {

    public static double calculateAverage(int[] num,int k){

        int average=0;
        for(int i=0;i<k;i++){
            average=(average+num[i]);
        }
        long Max=average;
        for(int i=k;i< num.length;i++){
            average=average+num[i]-num[i-k];
            Max=Math.max(Max,average);
        }

        return Max;
    }

    public static void main(String[] args) {
        int[] num={1,12,2,7,8,3,4,3,6,8,9,3};
        System.out.println("Enter the Length :");
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println("Output :"+MaximumAverageSubArray.calculateAverage(num,k));



    }
}
