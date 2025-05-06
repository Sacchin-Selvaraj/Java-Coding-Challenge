package Arrays;

import java.util.Arrays;

public class CountInversion {

    public static void main(String[] args) {

        int[] num={5,3,2,4,1};
        int count=0;
        System.out.println(mergeSortinCount(0,num.length-1,num,count));
        System.out.println(Arrays.toString(num));

    }

    private static int mergeSortinCount(int left, int right, int[] num, int count) {
        if (left>=right){
            return 0;
        }
        int mid=(left+right)/2;
        count+=mergeSortinCount(left,mid,num,count);
        count+=mergeSortinCount(mid+1,right,num,count);
        count+=mergeSortArrays(left,mid,right,num,count);
        return count;
    }

    private static int mergeSortArrays(int left, int mid, int right, int[] num, int count) {
        int low=left;
        int end=mid+1;
        int k=0;
        int[] temp=new int[right-left+1];
        while (low<=mid && end<=right){
            if (num[low]<num[end]){
                temp[k++]=num[low];
                low++;
            }else {
                count=count+(mid-low);
                temp[k++]=num[end];
                end++;
            }
        }

        while (low<=mid){
            temp[k++]=num[low];
            low++;
        }
        while (end<=right){
            temp[k++]=end;
            end++;
        }
        for (int i = 0; i < temp.length; i++) {
            num[left+i]=temp[i];
        }
        return count;
    }
}
