import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> fizz = new ArrayList<>();
        int i = 1;
        while (n-- > 0) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizz.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizz.add("Fizz");
            } else if (i % 5 == 0) {
                fizz.add("Buzz");
            } else {
                fizz.add(String.valueOf(i));
            }
            i++;
        }

        return fizz;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        FizzBuzz obj=new FizzBuzz();
        List<String> arr=obj.fizzBuzz(n);
        System.out.println(arr);

    }
}
