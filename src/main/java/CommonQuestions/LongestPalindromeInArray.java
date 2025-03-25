package CommonQuestions;

public class LongestPalindromeInArray {

    public static void main(String[] args) {
        int[] nums={121, 2322, 54545, 999999};
        System.out.println(findLongestPalindrome(nums));
    }

    private static int findLongestPalindrome(int[] nums) {

        int res=-1;
        for (int num:nums){
            if (num>res&&isPalindrome(num)){
                res=num;
            }
        }
        return res;
    }

    private static boolean isPalindrome(int num) {
        int res=num;
        int reverseNum=0;
        while (num>0){
             int rem=num%10;
             reverseNum=(reverseNum*10)+rem;
             num=num/10;
        }
        return res == reverseNum;
    }
}
