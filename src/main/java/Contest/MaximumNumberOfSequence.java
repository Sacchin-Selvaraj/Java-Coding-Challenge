package Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumNumberOfSequence {
    public static long numOfSubsequences(String s) {
//        int smallerElement=Integer.MAX_VALUE;
//        Map<Character,Integer> map=new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='L' || s.charAt(i)=='C' || s.charAt(i)=='T'){
//                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//            }
//        }
//       if (map.size()<=1)
//           return 0;
//
//        long ans=1;
//        PriorityQueue<Integer> queue=new PriorityQueue<>(map.values());
//
//       if (map.size()==2){
//           while (!queue.isEmpty()){
//               ans*=queue.poll();
//           }
////           return ans;
//       }
//
//        smallerElement= queue.poll();
//        smallerElement++;
//        ans*=smallerElement;
//        while (!queue.isEmpty()){
//            ans*=queue.poll();
//        }
//        return ans;
        int n = s.length();
        int[] prefixL = new int[n + 1]; // prefixL[i] = number of 'L's in s[0..i-1]
        int[] suffixT = new int[n + 1]; // suffixT[i] = number of 'T's in s[i..n-1]

        // Compute prefixL
        for (int i = 0; i < n; i++) {
            prefixL[i + 1] = prefixL[i] + (s.charAt(i) == 'L' ? 1 : 0);
        }

        // Compute suffixT
        for (int i = n - 1; i >= 0; i--) {
            suffixT[i] = suffixT[i + 1] + (s.charAt(i) == 'T' ? 1 : 0);
        }

        // Initial count of "LCT" without any insertion
        long initialCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'C') {
                initialCount += (long) prefixL[i] * suffixT[i + 1];
            }
        }

        long maxCount = initialCount;

        // Try inserting 'L', 'C', or 'T' at every possible position
        for (int i = 0; i <= n; i++) {
            // Case 1: Insert 'L' at position i
            long newL = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'C') {
                    newL += suffixT[j + 1];
                }
            }
            maxCount = Math.max(maxCount, initialCount + newL);

            // Case 2: Insert 'C' at position i
            long newC = 0;
            int leftL = prefixL[i];
            int rightT = suffixT[i];
            newC = (long) leftL * rightT;
            maxCount = Math.max(maxCount, initialCount + newC);

            // Case 3: Insert 'T' at position i
            long newT = 0;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == 'C') {
                    newT += prefixL[j];
                }
            }
            maxCount = Math.max(maxCount, initialCount + newT);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String s="LCTKLCLT";
        System.out.println(numOfSubsequences(s));
    }
}
