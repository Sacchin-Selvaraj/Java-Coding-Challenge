package Java_Program;

public class LongestPalindromic {

    public static String longestPalindrome(String s) {

        if(s.length()==1)
            return s;
        int count,max=0;
        String palindromic=null;
        for (int i = 0; i < s.length(); i++) {
            int idx=i;
            int lstIdx=s.lastIndexOf(s.charAt(i));
            if (idx==lstIdx)
                continue;
            while (idx<lstIdx){
                count=lstIdx-idx+1;
                if(count>max) {
                    max = count;
                    palindromic=s.substring(idx,lstIdx+1);
                }
                idx++;
                lstIdx--;
                if (idx<lstIdx && s.charAt(idx)!=s.charAt(lstIdx)){
                    count=0;
                    max=0;
                    break;
                }
            }
        }
        System.out.println(max);
        return palindromic;
    }

    public static void main(String[] args) {
        String str="babad";
        System.out.println(longestPalindrome(str));
    }
}
