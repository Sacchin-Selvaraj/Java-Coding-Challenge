package Recursion;

public class Name5Times {

    static void displayName(int n){
        if (n<0)
            return;
        System.out.println("Sachin");
        displayName(n-1);
    }

    public static void main(String[] args) {
        displayName(5);

    }
}
