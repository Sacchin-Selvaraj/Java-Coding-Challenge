package StarPatterns;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 5;
        print2(n);
        print1(n);
    }

    private static void print1(int n) {
        int space = 2;
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
            space += 2;
        }
    }
    private static void print2(int n) {
        int space = 2*n-2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            space -= 2;
        }

    }
}
