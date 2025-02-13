package CommonQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Palindrome {

    public static void main(String[] args) {

        String str="Sacchin";

        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("No Valid Palindrome");
                break;
            }
            left++;
            right--;
        }
         List<Integer> list =new ArrayList<>(List.of(1,2,3,4,5,7,8,9,0,10,11,12,13,14));
         Spliterator<Integer> spliterator= list.spliterator();

         Spliterator<Integer> splited=spliterator.trySplit();
         splited.forEachRemaining(System.out::println);

        System.out.println("remaining");
        System.out.println(spliterator.estimateSize());

         spliterator.forEachRemaining(System.out::println);



    }
}
