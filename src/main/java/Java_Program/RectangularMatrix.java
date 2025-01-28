package Java_Program;

import java.util.Scanner;

public class RectangularMatrix {
    static Scanner sc=new Scanner(System.in);
    private static int rectangleMatrix(int[][] matrix){
        int sum=0;
        System.out.println("Enter the row and Column value ");
        int[][] num=new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j]=sc.nextInt();
            }
        }
        for (int i = num[0][0]; i <= num[1][0] ; i++) {
            for (int j = num[0][1]; j <= num[1][1] ; j++) {
                sum=sum+matrix[i][j];
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        return sum;
    }

    public static void main(String[] args) {

        int[][] matrix=new int[4][5];
        System.out.println("Enter the Matrix value");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(rectangleMatrix(matrix));
    }
}
