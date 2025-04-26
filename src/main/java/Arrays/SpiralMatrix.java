package Arrays;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Arrays.deepToString(findSpiralMatrix(n)));
    }

    private static int[][] findSpiralMatrix(int n) {
        int [][] ans=new int[n][n];
        int num=0;
        int left=0,right=n,top=0,bottom=n;
        for (int i = 0; i < n; i++) {
            for (int j = left; j < right ; j++) {
                ans[top][j]=num++;
            }
            top++;
            right--;
            for (int j = top; j < bottom ; j++) {
                ans[right][j]=num++;
            }
            right--;
            bottom--;
            for (int j = right; j >= left ; j--) {
                ans[bottom][j]=num++;
            }
            bottom++;
            for (int j = bottom; j >=top ; j--) {
                ans[left][j]=num++;
            }
        }
        return ans;
    }
}
