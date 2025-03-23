package Recursion;

public class SumOfNumbers {

    static int sum=0;
    public static void main(String[] args) {

        int n=10;
        sumofNumbers(n,sum);
    }

    private static void sumofNumbers(int n,int sum) {
       if (n<0){
           System.out.println(sum);
           return;
       }
       sumofNumbers(n-1,sum+n);
    }
}
