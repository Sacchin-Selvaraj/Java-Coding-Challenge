package Contest;

import java.util.Iterator;
import java.util.PriorityQueue;

public class NonOverlappingSub {

    public static void main(String[] args) {
        int[] arr={2,1,3,3,2,3,1};
        int target=6;
        System.out.println(minSumOfLengths(arr,target));
    }

    public static int minSumOfLengths(int[] arr, int target) {

        int left=0;
        int right=0;
        int sum=0;

        PriorityQueue<Integer> queue=new PriorityQueue<>();

        PriorityQueue<int[]> queue1=new PriorityQueue<>((o1, o2) -> o2[1]-o1[1]);

        Iterator<int[]> iterator = queue1.iterator();

        while (iterator.hasNext()){
            int[] event = iterator.next();
        }

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

        if(queue.size()==1 || queue.isEmpty()) return -1;

        int res=0;
        int n=0;
        while(n<2){
            n++;
            res+=queue.poll();
        }

        return res;
    }
}
