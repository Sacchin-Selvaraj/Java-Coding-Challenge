package CommonQuestions;

public class FibonacciRecursion {

    public static void main(String[] args) {

        int n=4;
        System.out.println(findFibonacci(n));
    }

    private static int findFibonacci(int n) {
        if (n<=1)
            return n;
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
