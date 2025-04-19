package StarPatterns;

public class Pattern2 {

    public static void main(String[] args) {

        int n=9;
        print1(n);
    }

    private static void print1(int n) {
        int space=2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < space ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
            space-=2;
        }

    }
}
