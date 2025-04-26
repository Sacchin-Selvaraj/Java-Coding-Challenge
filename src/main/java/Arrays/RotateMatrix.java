package Arrays;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(findRotateMatrix(arr)));
        System.out.println(Arrays.deepToString(findRotateMatrix2(arr)));
    }

    private static int[][] findRotateMatrix2(int[][] arr) {
        //optimal solution
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int left=0,right= arr.length-1;
            while (left<right){
                int temp2=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp2;
                left++;
                right--;
            }
        }
        return arr;
    }

    private static int[][] findRotateMatrix(int[][] arr) {
        //brute force
        int[][] res=new int[arr.length][arr.length];
        int len= arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                res[j][len]=arr[i][j];
            }
            len--;
        }
        return res;
    }
}
