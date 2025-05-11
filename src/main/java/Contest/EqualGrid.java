package Contest;

public class EqualGrid {

    public static boolean canPartitionGrid(int[][] grid) {

        for (int rowCut = 0; rowCut < grid.length ; rowCut++) {
            int rowSum1 = 0;
            for (int i = 0; i <= rowCut; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    rowSum1 += grid[i][j];
                }
            }
            int rowSum2 = 0;
            for (int i = rowCut+1; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    rowSum2 += grid[i][j];
                }
            }
            if (rowSum1 == rowSum2) return true;
        }
        for (int colCut = 0; colCut < grid[0].length; colCut++) {
            int colSum1=0,colSum2=0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j <= colCut; j++) {
                    colSum1 += grid[i][j];
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = colCut+1; j < grid[0].length; j++) {
                    colSum2 += grid[i][j];
                }
            }
            if (colSum1==colSum2)return true;
        }


        return false;

    }
    public static void main(String[] args) {

        int [][] grid={
                {1,4},
                {2,3}
        };
        System.out.println(canPartitionGrid(grid));
    }
}
