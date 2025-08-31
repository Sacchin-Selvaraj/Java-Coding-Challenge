package Recursion;

public class TwistedMirror {

    public static int uniquePaths(int[][] grid) {
        int[] res=new int[1];
        findUniquePaths(grid,0,0,res,0,0);
        return res[0];
    }

    private static void findUniquePaths(int[][] grid, int i, int j, int[] res,int n,int m) {
        if(i==grid.length-1 && j==grid[0].length-1){
            res[0]=res[0]+1;
            return;
        }
        if (grid[i][j]==1){
            if (i==n){
                if (isValidMove(grid,i+1,j)) {
                    findUniquePaths(grid, i+1, j, res, i, j);
                }
            }else if(j==m){
                if (isValidMove(grid,i,j+1)){
                    findUniquePaths(grid, i, j+1, res, i, j);
                }
            }
            return;
        }
        if(isValidMove(grid,i,j+1)){
            if (grid[i][j+1]==1 && isValidMove(grid,i+1,j+1)){
                findUniquePaths(grid,i+1,j+1,res,i,j+1);
            } else if (grid[i][j+1]==0) {
                findUniquePaths(grid, i, j+1, res,i,j+1);
            }
        }
        if(isValidMove(grid,i+1,j)){
            if (grid[i+1][j]==1 && isValidMove(grid,i+1,j+1)){
                findUniquePaths(grid,i+1,j+1,res,i+1,j);
            } else if (grid[i+1][j]==0) {
                findUniquePaths(grid, i+1, j, res,i+1,j);
            }
        }
    }

    private static boolean isValidMove(int[][] grid, int i, int j) {
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid={
                {0,1,1},
                {1,1,0}
        };
        System.out.println(uniquePaths(grid));
    }

}
