package StackAndQueue;

import java.util.ArrayDeque;

public class CelebrityProblem {

    public static void main(String[] args) {

        int[][] matrix={
                {0,1,1,0},
                {0,0,0,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        System.out.println(findCelebrity(matrix));
    }

    private static boolean findCelebrity(int[][] matrix) {

        int top=0;
        int bottom = matrix.length-1;
        while (top<bottom){
            if (matrix[top][bottom]==1){
                top++;
            } else if (matrix[bottom][top]==1) {
                bottom--;
            }else {
                top++;
                bottom--;
            }
        }
        ArrayDeque<Integer> deque=new ArrayDeque<>();

        if (top>bottom)
            return false;
        for (int i = 0; i < matrix.length; i++) {
            if (i==top)
                continue;
            if (matrix[top][i]!=0 || matrix[i][top]!=1){
                return false;
            }
        }
        System.out.println(top);
        return true;
    }
}
