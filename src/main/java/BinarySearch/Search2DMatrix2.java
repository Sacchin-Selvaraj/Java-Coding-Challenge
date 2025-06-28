package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Search2DMatrix2 {

    public static void main(String[] args) {

        int[][] arr={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        System.out.println(Arrays.toString(findRowColumn(arr,16)));
    }

    private static int[] findRowColumn(int[][] arr, int target) {
        int x=0,y=arr[0].length-1;
        while ( (x < arr.length && y>=0) && (y!=0 || x!=4)){
            int num=arr[x][y];
            if (num==target){
                return new int[]{x,y}; 
            } else if (num>target) {
                y=y-1;
            }else {
                x=x+1;
            }
        }
        return new int[]{-1,-1};
    }
}
