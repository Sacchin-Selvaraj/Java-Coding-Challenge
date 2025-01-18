package Java_Program;

import java.util.Arrays;
import java.util.Scanner;


// LeetCode 239
public class SlidingWindowMaximum {


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
