package Recursion;

public class Palindrome {

    public static void main(String[] args) {

        String str="madam";
        System.out.println(findPalindrome(str,0,str.length()-1));
    }
    private static boolean findPalindrome(String str, int left,int right) {
        if (left>=right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;

        return  findPalindrome(str, left + 1, right - 1);
    }
}
