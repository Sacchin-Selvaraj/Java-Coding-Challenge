package Java_Program;

import java.util.Arrays;
import java.util.Scanner;

public class FinalArrayState {

    public int[] getFinalState(int[] arr,int k ,int mul){
       int[] num=new int[arr.length];
       for(int i=1;i<=k;i++) {
           num=getMin(arr);
           System.out.println(Arrays.toString(arr));
           arr[num[1]]=num[0]*mul;
       }
       return arr;
    }

    public int[] getMin(int[] getMin){
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<getMin.length;i++){
            if(getMin[i]<min){
                min=getMin[i];
                idx=i;
            }
        }
        return new int[]{min,idx};
    }
//    public int[] sorting(int[] sort){
//        for(int i=0;i< sort.length;i++){
//            for(int j=i+1;j< sort.length;j++){
//                if(sort[i]>sort[j]){
//                    int temp=sort[i];
//                    sort[i]=sort[j];
//                    sort[j]=temp;
//                }
//            }
//        }
//        return sort;
//    }

    public static void main(String[] args) {
        int[] arr={2,1,3,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Multiplier");
        int mul= sc.nextInt();
        System.out.println("Enter the K number");
        int k= sc.nextInt();
        FinalArrayState obj=new FinalArrayState();
        arr=obj.getFinalState(arr,k,mul);
        System.out.println(Arrays.toString(arr));

    }
}
