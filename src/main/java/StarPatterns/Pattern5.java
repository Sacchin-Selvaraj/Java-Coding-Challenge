package StarPatterns;

public class Pattern5 {

    public static void main(String[] args) {
        int n=5;
        print1(n);
    }

    private static void print1(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j <2*n-1; j++) {
                int top=i;
                int left=j;
                int right=2*n-2-j;
                int bottom=2*n-2-i;
                int min=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-(min)+" ");
            }
            System.out.println(" ");
        }

    }
}
