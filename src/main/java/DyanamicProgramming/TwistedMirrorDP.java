package DyanamicProgramming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class TwistedMirrorDP {

    public static int uniquePaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[n][m][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return findUniquePathsDP(grid,0,0,0,dp,n,m);
    }

    private static int findUniquePathsDP(int[][] grid, int i, int j,int dir, int[][][] dp, int n, int m) {
        if (i==n-1 && j==m-1){
            return 1;
        }
        if (i>=n || j>=m)
            return 0;
        if (dp[i][j][dir]!=-1)
            return dp[i][j][dir];
        int ways=0;
        if (grid[i][j]==1){
            if(dir==0){
                ways=findUniquePathsDP(grid, i+1, j, 1, dp, n, m);
            }else {
                ways=findUniquePathsDP(grid, i, j+1, 0, dp, n, m);
            }
        }else {
            ways+=findUniquePathsDP(grid, i, j+1, 0, dp, n, m);
            ways+=findUniquePathsDP(grid, i+1, j, 1, dp, n, m);
        }
        return dp[i][j][dir]=ways%1000000007;
    }

    public static void main(String[] args) {
        int[][] grid={
                {0,1,1},
                {1,1,0}
        };
        HashMap<Integer,Integer> map=new HashMap<>();

        System.out.println(uniquePaths(grid));
    }

}
