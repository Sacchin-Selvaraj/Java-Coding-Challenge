package Contest;

import java.util.Arrays;

public class MaximumActiveSection {
//    public static int maxActiveSectionsAfterTrade(String s) {
//
//        if (s.length()==2){
//            int count=0;
//            for (int i:s.toCharArray()){
//                if (i==49)
//                    count++;
//            }
//            return count;
//        }
//        char[] section=s.toCharArray();
//        int max=-1;
//        for (int i = 0; i < section.length; i++) {
//            int activeSection=0;
//            int num=section[i]-48;
//            if (num==1) {
//                activeSection = findActiveSection(section, i);
//            }
//            if (activeSection>max)
//                 max=activeSection;
//        }
//        return max;
//    }
//
//    private static int findActiveSection(char[] section, int i) {
//        char[] tempSection = Arrays.copyOf(section,section.length);
//        tempSection[i]=48;
//        int j=i+1;
//        while (j<tempSection.length && tempSection[i]==tempSection[j]){
//            tempSection[j]=49;
//            j++;
//        }
//        int k=i-1;
//        while (k>=0 && tempSection[i]==tempSection[k]){
//            tempSection[k]=49;
//            k--;
//        }
//        tempSection[i]=49;
//        int left=0;
//        int right=0;
//        int max=-1;
//        boolean flag=true;
//       while (right<tempSection.length){
//            if (tempSection[right]-48==1){
//                right++;
//            }else {
//                if (right-left>max)
//                    max=right-left;
//                left=right+1;
//                right++;
//                flag=false;
//            }
//        }
//       if (flag&&right>max)
//           max=right;
//        return max;
//    }
public static int maxActiveSectionsAfterTrade(String s) {
    String news = "1" + s + "1";
    int c1 = 0;

    for (char ch : s.toCharArray()) {
        if (ch == '1') {
            c1++;
        }
    }

    int i = 1, ans = c1;

    while (i < news.length() - 1) {
        if (news.charAt(i) == '1') {
            int k = i;

            while (k < news.length() && news.charAt(k) == '1') {
                k++;
            }

            if (k < news.length() - 1 && news.charAt(i - 1) == '0' && news.charAt(k) == '0') {
                int c2 = 0, c3 = 0;
                int l = i - 1;

                while (l >= 0 && news.charAt(l) == '0') {
                    c2++;
                    l--;
                }

                l = k;
                while (l < news.length() && news.charAt(l) == '0') {
                    c3++;
                    l++;
                }

                ans = Math.max(ans, c1 + c2 + c3);
            }

            i = k;
        } else {
            i++;
        }
    }

    return ans;
}

    public static void main(String[] args) {
        String s="0100";
        System.out.println(maxActiveSectionsAfterTrade(s));
    }
}

