package CommonQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class ReverseStrings {

    public static void main(String[] args) {

        String str = "zyxwvutsrqponmlkjihgfedcba";

        char[] arr = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("\n2nd Method"+ Arrays.toString(arr));

        Stack<Character> strs=new Stack<>();

        for (char c:str.toCharArray()){
            strs.push(c);
        }
        System.out.println("3rd Method");
        for (char c:arr){
            char ch =strs.pop();
            System.out.print(ch);

        }
        HashSet<Character> set=new HashSet<>();

    }
}
