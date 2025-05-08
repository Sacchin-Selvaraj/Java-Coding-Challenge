package Recursion;


import java.util.Arrays;
import java.util.HashSet;

public class Suduko {
   static int count=0;
    public static void main(String[] args) {

        String[][] suduko = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"},
        };
        if (isValidSudoku(suduko)) {
            sudukoSolver(suduko);
            for (String[] sc : suduko) {
                System.out.println(Arrays.toString(sc));
            }
            System.out.println("Count = "+count);

        } else
            System.out.println("Not a Valid Suduko");


    }

    private static boolean sudukoSolver(String[][] suduko) {

        for (int i = 0; i < suduko.length; i++) {
            for (int j = 0; j < suduko[0].length; j++) {

                if (suduko[i][j] != ".") {
                    continue;
                }
                for (int k = 1; k <= 9; k++) {
                    count++;
                    if (isValidNumber(suduko, k, i, j)) {
                        suduko[i][j] = String.valueOf(k);
                        if (sudukoSolver(suduko)) {
                            return true;
                        } else {
                            suduko[i][j] = ".";
                        }
                    }

                }
                return false;

            }
        }
        return true;
    }

    private static boolean isValidNumber(String[][] suduko, int k, int row, int column) {
        String s = String.valueOf(k);
        for (int i = 0; i < 9; i++) {
            if (suduko[row][i].equals(s)) {
                return false;
            }
            if (suduko[i][column].equals(s)) {
                return false;
            }
            int dupliRow = row - row % 3 + i / 3;
            int dupliColumn = column - column % 3 + i % 3;
            if (suduko[dupliRow][dupliColumn].equals(s)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isValidSudoku(String[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!isValidNumberSuduko(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidNumberSuduko(String[][] suduko, int row, int column) {
        HashSet<String> set = new HashSet<>();
        int rowColumn=row+column;
        for (int i = 0; i < 9; i++) {
            int rowSum=row+i;
            int columnSum=column+i;
            String s = suduko[row][column];
            if (s.equals("."))
                continue;
            if (rowColumn!=rowSum && suduko[row][i].equals(s)) {
                return false;
            }
            if (rowColumn!=columnSum && suduko[i][column].equals(s)) {
                return false;
            }
            int dupliRow = row - row % 3 + i / 3;
            int dupliColumn = column - column % 3 + i % 3;
            if (suduko[dupliRow][dupliColumn].equals("."))
                continue;
            if (set.add(suduko[dupliRow][dupliColumn])) {

            } else
                return false;
        }
        set.clear();
        return true;
    }
}
