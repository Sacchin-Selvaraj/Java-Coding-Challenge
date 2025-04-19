package StarPatterns;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;
        print1(n);
        print2(n);
        print3(n);
        print4(n);
    }

    private static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (char c = 'A'; c <= 'A' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }

    }

    private static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (char c = 'A'; c <= 'A' + n - i - 1; c++) {
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }

    }

    private static void print3(int n) {
        for (char c = 'A'; c <= 'A' + n - 1; c++) {
            for (int j = 0; j <= c - 65; j++) {
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }

    }

    private static void print4(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1 - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println(" ");
        }

    }


}
