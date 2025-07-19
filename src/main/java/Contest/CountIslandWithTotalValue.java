package Contest;

import java.util.ArrayDeque;
import java.util.Queue;

public class CountIslandWithTotalValue {

    public static int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int countIsland=0;
        boolean[][] vis=new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int valueOfIsland=0;
                if (!vis[i][j] && grid[i][j]!=0){
                    valueOfIsland=bfsIsland(grid,vis,i,j);
                    if (valueOfIsland%k==0){
                        countIsland++;
                    }
                }

            }
        }
        return countIsland;
    }

    private static int bfsIsland(int[][] grid, boolean[][] vis, int i, int j) {
        int totalValue=0;
        totalValue+=grid[i][j];
        vis[i][j]=true;
        Queue<int[]> bfs=new ArrayDeque<>();
        bfs.add(new int[]{i,j});

        while (!bfs.isEmpty()){
            int[] pair=bfs.poll();
            int row=pair[0];
            int col=pair[1];
            int[] rowdir={-1,0,1,0};
            int[] coldir={0,1,0,-1};
            for (int k = 0; k < 4; k++) {
                int nx=row+rowdir[k];
                int ny=col+coldir[k];
                if (isvalidIslands(nx,ny,grid,vis)){
                    vis[nx][ny] = true;
                    totalValue+=grid[nx][ny];
                    bfs.add(new int[]{nx,ny});
                }
            }
        }
        return totalValue;
    }

    private static boolean isvalidIslands(int nx, int ny, int[][] grid, boolean[][] vis) {
        if (nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && !vis[nx][ny] & grid[nx][ny]!=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid={
                {0,2,1,0,0},
                {0,5,0,0,5},
                {0,0,1,0,0},
                {0,1,4,7,0},
                {0,2,0,0,8},
        };
        int k=5;
        System.out.println(countIslands(grid,k));
    }
}

