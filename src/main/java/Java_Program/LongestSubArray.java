package Java_Program;

import java.util.HashSet;

public class LongestSubArray {

    public static int findLongestArray(String arr){

        HashSet<Character> hash= new HashSet<>();
        int right=0,left=0;
        int Max_Length=0;
        for(int i=right;i<arr.length();i++){
            while(hash.contains(arr.charAt(i))){
                hash.remove(arr.charAt(left));
                left++;
            }
            hash.add(arr.charAt(i));
            Max_Length=Math.max(Max_Length,i-left+1);
        }
        return Max_Length;

    }

    public static void main(String[] args) {
        String array="sacchin";
        int result=LongestSubArray.findLongestArray(array);
        System.out.println("Maximum SubString of Array :"+result);

    }
}
