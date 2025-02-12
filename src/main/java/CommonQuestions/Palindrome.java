package CommonQuestions;

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

    }
}
