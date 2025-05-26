package Arrays;

import java.util.Scanner;

public class TicTacToc {
    static Scanner sc=new Scanner(System.in);
    static int n;
    static int move=1;
    static int row;
    static int col;
    static int moves=0;
    public static void main(String[] args) {

        System.out.println("Enter the Board Size :");
        int boardSize=sc.nextInt();
        char[][] board=new char[boardSize][boardSize];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col]='-';
            }
        }
        n=board.length;
        while (moves<n*n){
            displayBoard(board);
            makeMove(board);
            isWinnerAvailable(board);
        }
        System.out.println("Game Draw...");
        sc.close();
    }
    private static void isWinnerAvailable(char[][] board) {
        if (checkRow(board)||checkColumn(board)||checkDiagonal(board)){
            System.out.println("Player "+board[row][col]+" is the Winner...");
            displayBoard(board);
            System.exit(0);
        }
    }

    private static boolean checkColumn(char[][] board) {
        char ch=board[row][col];
        for (int row = 0; row < n; row++) {
            if (board[row][col]!=ch){
               return false;
            }
        }
        return true;
    }

    private static boolean checkRow(char[][] board) {
        char ch=board[row][col];
        for (int col = 0; col < n; col++) {
            if (board[row][col]!=ch){
                return false;
            }
        }
        return true;
    }


    private static boolean checkDiagonal(char[][] board) {
        char ch=board[row][col];
        boolean diagonal1=true,diagonal2=true;
        for (int i = 0; i < n; i++) {
            if (board[i][i]!=ch){
                diagonal1=false;
            }
            if (board[i][n-1-i]!=ch){
                diagonal2=false;
            }
        }
        return diagonal1 || diagonal2;
    }

    private static void makeMove(char[][] board) {
        if (move==1) {
            System.out.println("Player X make your move...");
            move=0;
        }
        else {
            System.out.println("Player O make your move...");
            move=1;
        }
        row=sc.nextInt();
        col=sc.nextInt();
        if (row<0 || row>=n || col<0 || col>=n || board[row][col]!='-'){
            System.out.println("Enter an valid Input...");
            move=1-move;
            makeMove(board);
            return;
        }
        if (move==0){
            board[row][col]='X';
            moves++;
        }else {
            board[row][col] = 'O';
            moves++;
        }


    }

    private static void displayBoard(char[][] board) {
        System.out.println("------------");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
}
