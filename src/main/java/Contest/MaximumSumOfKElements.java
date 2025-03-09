package Contest;

import java.util.*;

public class MaximumSumOfKElements {
//    public static long[] findMaxSum(int[] nums1, int[] nums2, int k) {
//
//        long[] res=new long[nums1.length];
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int i=0;
//        for (int num:nums2){
//            map.put(i++,num);
//        }
//        for (int j = 0; j < nums1.length; j++) {
//            List<Integer> list=new ArrayList<>();
//            long num=0;
//            for (int l = 0; l < nums1.length; l++) {
//                if (nums1[l]<nums1[j]){
//                    list.add(l);
//                }
//            }
//            num=calculateMaxHeap(list,k,map);
//            res[j]=num;
//        }
//        return res;
//
//    }
//
//    private static long calculateMaxHeap(List<Integer> list,int k, HashMap<Integer, Integer> map) {
//        PriorityQueue<Integer> queue=new PriorityQueue<>();
//        int sum=0;
//        if (list.isEmpty())
//            return 0;
//        if (list.size()<k){
//           for (int num:list){
//              sum=sum+map.get(num);
//           }
//           return sum;
//        }
//        for (int i = 0; i < k; i++) {
//            queue.add(map.get(list.get(i)));
//        }
//        for (int i = k; i < list.size() ; i++) {
//            queue.add(map.get(list.get(i)));
//            if (queue.size()>k){
//                queue.poll();
//            }
//        }
//        while (!queue.isEmpty()){
//            sum=sum+queue.poll();
//        }
//        return sum;
//    }

    public static long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        // Step 1: Create a "pair" array that stores (nums1[i], nums2[i], original index)
        // This helps us keep track of the original indices after sorting.
        int[][] pair = new int[n][3];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums1[i];  // Value from nums1
            pair[i][1] = nums2[i];  // Corresponding value from nums2
            pair[i][2] = i;         // Original index (to restore order later)
        }

        // Step 2: Sort the "pair" array based on nums1 values
        // Sorting helps us process elements in increasing order.
        Arrays.sort(pair, (a, b) -> a[0] - b[0]);

        // Step 3: Use a min-heap (priority queue) to keep track of the `k` largest nums2 values encountered so far.
        // The heap allows efficient removal of the smallest element when needed.
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long currSum = 0;  // Keeps track of the sum of the `k` largest elements in the heap.
        long[] res = new long[n]; // This stores the final result in the correct order.

        // Step 4: Iterate through the sorted nums1 values and compute the required sum for each index.
        for (int i = 0; i < n; i++) {
            // If no previous elements exist, the sum is 0.
            if (pq.size() == 0) {
                res[pair[i][2]] = 0;
            }
            // If the current nums1 value is the same as the previous one,
            // reuse the previous computed sum to save time.
            else if (i > 0 && pair[i][0] == pair[i - 1][0]) {
                res[pair[i][2]] = res[pair[i - 1][2]];
            }
            // Otherwise, store the current running sum.
            else {
                res[pair[i][2]] = currSum;
            }

            // Add the current nums2 value to the heap and update the running sum.
            pq.offer((long) pair[i][1]);
            currSum += pair[i][1];

            // If more than `k` elements are in the heap, remove the smallest to maintain only `k` elements.
            if (pq.size() > k) {
                currSum -= pq.poll();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1={4,2,1,5,3};
        int[] nums2={10,20,30,40,50};
        int k=2;
        System.out.println(Arrays.toString(findMaxSum(nums1,nums2,k)));
    }
}
