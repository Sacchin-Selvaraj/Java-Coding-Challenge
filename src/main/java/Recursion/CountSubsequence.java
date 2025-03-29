package Recursion;

public class CountSubsequence {

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int sum=0;
        System.out.println(findCount(arr,0,arr.length,sum));
    }

    private static int findCount(int[] arr, int left, int length, int sum) {

        if (left>=length){
            if (sum==2)
                return 1;
            else
                return 0;
        }
        sum=sum+arr[left];
        int low=findCount(arr,left+1,length,sum);
        sum=sum-arr[left];
        int high=findCount(arr,left+1,length,sum);

        return low+high;

    }
}
