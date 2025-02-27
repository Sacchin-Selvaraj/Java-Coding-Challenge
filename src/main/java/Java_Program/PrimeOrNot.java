package Java_Program;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the Numbers :");
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
        }
        Boolean[] res=new Boolean[n];
        for (int i = 0; i < n; i++) {
            res[i]=checkPrimeOrNot(num[i]);
        }
        System.out.println(Arrays.toString(res));

    }

    private static Boolean checkPrimeOrNot(int i) {
        if (i <= 1) {
            return false;
        }
        System.out.println("Square Root"+Math.sqrt(i));
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
}
