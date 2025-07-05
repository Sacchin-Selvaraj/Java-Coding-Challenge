package Graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class DistanceNearestCell {

    public static int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] grid=new int[n][m];
        boolean[][] vis=new boolean[n][m];
        Queue<int[]> queue=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               if (mat[i][j]==0){
                   queue.add(new int[]{i,j,0});
               }
            }
        }
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
        while (!queue.isEmpty()){
            int[] pair=queue.poll();
            grid[pair[0]][pair[1]]=pair[2];
            for (int k = 0; k < 4; k++) {
                int nx=pair[0]+directions[k][0];
                int ny=pair[1]+directions[k][1];
                if (nx>=0 && nx<mat.length && ny>=0 && ny<mat[0].length && !vis[nx][ny]){
                    if (mat[nx][ny]==1) {
                        queue.add(new int[]{nx,ny,pair[2]+1});
                        vis[nx][ny]=true;
                    }
                }
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        int[][] grid={
                {0,1,0},
                {0,1,0},
                {0,1,0}
        };
        System.out.println(Arrays.deepToString(updateMatrix(grid)));
    }

    private static int[] nearest0Bfs(int[][] mat, int i, int j) {
        Queue<int[]> queue=new ArrayDeque<>();
        queue.offer(new int[]{i,j});
        int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
        while (!queue.isEmpty()){
            int[] pair=queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx=pair[0]+directions[k][0];
                int ny=pair[1]+directions[k][1];
                if (nx>=0 && nx<mat.length && ny>=0 && ny <mat[0].length){
                    if (mat[nx][ny]==1){
                        queue.add(new int[]{nx,ny});
                    }else {
                        return new int[]{nx,ny};
                    }
                }
            }
        }
        return new int[]{i,j};
    }
}
