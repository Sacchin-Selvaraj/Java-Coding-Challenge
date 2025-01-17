package Java_Program;

import java.util.Arrays;
import java.util.Scanner;


// LeetCode 239
public class SlidingWindowMaximum {
    public static int[] findMaximum(int[] num,int k){
        int Max=num[0];
        for(int i=0;i<k;i++){
            if(num[i]>Max)
                Max=num[i];
        }
        int[] Sum=new int[num.length];
        Sum[0]=Max;



        return Sum;


    }

    public static void main(String[] args) {
        int[] num={1,3,-1,-3,5,3,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the K Number :");
        int k=sc.nextInt();
        int[] Result=SlidingWindowMaximum.findMaximum(num,k);
        System.out.println("Output :"+ Arrays.toString(Result));

    }
}
