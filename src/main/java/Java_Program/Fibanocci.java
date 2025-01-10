package Java_Program;

import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int j = 0;
        int k = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = j + k;
            j = k;
            k = sum;
            System.out.println("Output :"+sum);

        }
        System.out.println("Sum of the numbers :" + sum);

    }
}
