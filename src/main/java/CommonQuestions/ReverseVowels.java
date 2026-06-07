package CommonQuestions;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        int left=0;
        int right = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] res = s.toCharArray();

        while(left<=right){
            while(left<=right && vowels.indexOf(res[left])<0){
                left++;
            }
            while(left<=right && vowels.indexOf(res[right])<0){
                right--;
            }

            char temp = res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }

        return new String(res);
    }
}
