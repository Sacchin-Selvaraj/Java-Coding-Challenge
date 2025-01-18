package Java_Program;

import java.util.HashMap;

public class PermutationDiffernce {
    public static int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int i=0,sum=0;
        for (Character c:t.toCharArray()){
            hashMap.put(c,i++);
        }
        for (int j = 0; j < s.length(); j++) {
            int temp=hashMap.get(s.charAt(j));
            sum=sum+Math.abs(j-temp);
        }
     return sum;
    }

    public static void main(String[] args) {
        String a="abc",b="bac";
        System.out.println(findPermutationDifference(a,b));
    }
}
