package TwoPointer_SlidingWindow;

public class LongestSubArraySum {

    public static void main(String[] args) {

        int[] arr={2,5,1,0,1,7,10};
        int k=14;
        System.out.println(findLongestSubArrays(arr,k));
    }

    private static int findLongestSubArrays(int[] arr, int k) {
        int left=0,right=0,sum=0,maxLen=Integer.MIN_VALUE;
        while (right<arr.length){
            sum+=arr[right];
            if (sum<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }else {
                while (sum>k){ // if we remove the while and place if it will be the optimal solution 0(n)
                    sum-=arr[left];
                    left++;
                }
            }
            right++;
        }
        return maxLen;
    }
}
