package Java_Program;

public class PalindromeTwoPointers {

   public static void main(String[] args) {

        String name="MaddaM";

        int left=0;
        int right=name.length()-1;
        int count=0;
        while(left<=right){
            if(name.charAt(left)==name.charAt(right)){
                left++;
                right--;
                count++;
            }
            else {
                System.out.println("Given String is not a Palindrome");
                System.exit(0);
            }
        }
       System.out.println("Given String is Palindrome");
    }
}
