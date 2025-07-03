package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int i;
    int j;

    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int islands=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==1 && !visited[i][j]){
                    islands++;
                    bfsIslands(grid,visited,i,j);
                }
            }
        }
        return islands;
    }

    private static void bfsIslands(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<Pair> bfs=new LinkedList<>();
        Pair node=new Pair(i,j);
        bfs.add(node);
        while (!bfs.isEmpty()){
            Pair nodes=bfs.poll();
            visited[nodes.i][nodes.j]=true;
            checkValidIsland(visited,grid,bfs,nodes.i,nodes.j);
        }
    }

    private static void checkValidIsland(boolean[][] visited, char[][] grid, Queue<Pair> bfs, int i, int j) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
        for (int[] arr:directions){
            int nx=i+arr[0];
            int ny=j+arr[1];
            if (nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && grid[nx][ny]==1){
                bfs.add(new Pair(nx,ny));
                visited[nx][ny]=true;
            }
        }
    }


    public static void main(String[] args) {
        char[][] grid={
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };
        System.out.println(numIslands(grid));
    }
}
