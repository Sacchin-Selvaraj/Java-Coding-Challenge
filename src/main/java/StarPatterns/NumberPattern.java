package StarPatterns;

import java.util.Arrays;
import java.util.Stack;

public class NumberPattern {

    public static void main(String[] args) {
        int n=9;
        int[][] matrix=new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int num=n-4;
        for (int i = 0; i < n; i++) {
            for (int j = left; j <= right; j++) {
               matrix[top][j]=num;
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                matrix[j][right]=num;
            }
            right--;
            for (int j = right; j >= left ; j--) {
                matrix[bottom][j]=num;
            }
            bottom--;
            for (int j = bottom; j >= top ; j--) {
                matrix[j][left]=num;
            }
            left++;
            num--;
        }
        for (int[] grid:matrix){
            System.out.println(Arrays.toString(grid));
        }
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.isEmpty();
    }

}
