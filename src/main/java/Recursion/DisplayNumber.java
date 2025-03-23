package Recursion;

public class DisplayNumber {

    public static void main(String[] args) {

        int n=9;
        displayNumber(n);
    }
    private static void displayNumber(int n) {
        if (n<0)
            return;
        System.out.println(n);
        displayNumber(n-1);
        System.out.println(n);
    }
}
