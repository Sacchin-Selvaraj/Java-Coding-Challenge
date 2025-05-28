package Greedy;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {

        int[] greed = {1, 5, 3, 3, 4};
        int[] child = {4, 2, 1, 2, 1, 3};
        System.out.println(findCookies(greed, child));
    }

    private static int findCookies(int[] greed, int[] child) {

        Arrays.sort(greed);
        Arrays.sort(child);
        int left = 0,right=0;
        int satisfied = 0;
       while (left < child.length && right < greed.length){
//           if (child[left]>=greed[right]){
//               satisfied++;
//               left++;
//               right++;
//           } else {
//               left++;
//           }
           // optimal Solution
           if (greed[right]<=child[left]){
               satisfied++;
               right++;
           }
           left++;
       }
        return satisfied;
    }
}