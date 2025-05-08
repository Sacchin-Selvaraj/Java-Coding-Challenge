package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        int n=1;
        List<List<String>> list=solveNQueens(n);
        for (List<String> l:list){
           for (String s:l){
               System.out.println(s);
           }
            System.out.println("----------------------");
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] bound=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bound[i][j]='.';
            }
        }
        Nqueens(result,bound,0,n);
        return result;
    }

    private static void Nqueens(List<List<String>> result, char[][] bound, int column, int n) {

        if (column==n){
            result.add(construct(bound));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(bound,row,column,n)){
                bound[row][column]='Q';
                Nqueens(result,bound,column+1,n);
                bound[row][column]='.';
            }
        }
    }

    private static boolean isSafe(char[][] bound, int row, int column, int n) {
        int dupliRow=row;
        int dupliCol=column;

        while (row>=0 && column>=0){
            if (bound[row][column]=='Q') return false;
            row--;
            column--;
        }
        row=dupliRow;
        column=dupliCol;
        while (column>=0){
            if (bound[row][column]=='Q') return false;
            column--;
        }
        column=dupliCol;
        while (row<n && column>=0){
            if (bound[row][column]=='Q')return false;
            row++;
            column--;
        }
        return true;
    }

    private static List<String> construct(char[][] bound) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i < bound.length; i++) {
            String row=new String(bound[i]);
            list.add(row);
        }
        return list;
    }
}
