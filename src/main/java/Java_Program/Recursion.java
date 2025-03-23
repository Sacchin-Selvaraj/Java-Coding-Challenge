package Java_Program;

public class Recursion {
    static void display(int n){
        if (n>0){
            display(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n=10;
        display(n);

    }
}
