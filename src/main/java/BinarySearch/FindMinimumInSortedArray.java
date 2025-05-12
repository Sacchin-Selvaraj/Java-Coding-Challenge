package BinarySearch;

public class FindMinimumInSortedArray {

    public static void main(String[] args) {

        int num[]={4,5,6,7,8,9,0,2,3};
        System.out.println(minimumNum(num));
    }

    private static int minimumNum(int[] num) {

        int left=0;
        int right=num.length-1;
        int min=Integer.MAX_VALUE;

        while (left<=right){
            int mid=(left+right)/2;
            if (num[left]<=num[mid]){
                min=Math.min(min,num[left]);
                left=mid+1;
            }else {
                min=Math.min(min,num[mid]);
                right=mid-1;
            }
        }
        return min;

    }
}
