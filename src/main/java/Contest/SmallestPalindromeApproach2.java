package Contest;

import java.util.TreeSet;

public class SmallestPalindromeApproach2 {
    public static String smallestPalindrome(String s) {
        if (s.length()==1)
            return s;
        TreeSet<String> set=new TreeSet<>();
        findPermutation(s.toCharArray(),0,set);
        for (String st:set){
            if(checkPalindromes(st))
                return st;
        }
        return s;
    }

    private static void findPermutation(char[] arr, int currentIndex, TreeSet<String> result) {
        if (currentIndex == arr.length - 1) {
            result.add(new String(arr));
            return;
        }

        for (int i = currentIndex; i < arr.length; i++) {
            swap(arr, currentIndex, i);      // Swap characters
            findPermutation(arr, currentIndex + 1, result);  // Recurse for next position
            swap(arr, currentIndex, i);      // Backtrack (undo swap)
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean checkPalindromes(String string) {

        int left=0;
        int right=string.length()-1;
        while (left<right){
            if (string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="aba";
        System.out.println(smallestPalindrome(str));

    }
}
