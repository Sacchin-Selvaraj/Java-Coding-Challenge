package Contest;

public class MaximumActiveSection2 {

    public static int maxActiveSectionsAfterTrade(String s) {
        String word="1"+s+"1";
        int max=0;
        for (int i = 1; i < word.length()-1; i++) {
            if (word.charAt(i)=='1'){
                int left=i-1;
                var right=i+1;
                int c1=0;
                for (char c:s.toCharArray()){
                    if (c=='1')
                        c1++;
                }
                int c2=0;
                int c3=0;
                boolean flag=false;
                while (right<word.length()&&word.charAt(right)=='0'&&word.charAt(left)=='0'){
                    c2++;
                    right++;
                    flag=true;
                }
                while (left>=0&&word.charAt(left)=='0'&&flag){
                    c3++;
                    left--;
                }
                max=Math.max(max,c1+c2+c3);
            }
        }

        return max;

    }
    public static void main(String[] args) {
        String s="10";
        System.out.println(maxActiveSectionsAfterTrade(s));
    }
}
