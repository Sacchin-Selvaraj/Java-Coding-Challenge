package Contest;

import java.util.PriorityQueue;

public class NonOverlappingSub {

    public static void main(String[] args) {
        int[] arr={3,2,2,4,3};
        int target=3;
        System.out.println(minSumOfLengths(arr,target));
    }

    public static int minSumOfLengths(int[] arr, int target) {

        int left=0;
        int right=0;
        int sum=0;

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[right];

            while(sum>target){
                sum-=arr[left];
                left++;
            }

            if(sum==target){
                int len=right-left+1;
                queue.add(len);
                sum=0;
                left=right+1;
            }

            right++;

        }

        if(queue.size()==1) return -1;

        int res=0;
        int n=0;
        while(n<2){
            n++;
            res+=queue.poll();
        }

        return res;
    }
}
