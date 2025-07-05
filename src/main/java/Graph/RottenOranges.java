package Graph;

import java.util.ArrayDeque;
import java.util.Queue;
class Pairs{
    int row;
    int col;
    int time;

    public Pairs(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
public class RottenOranges {

    public static int orangesRotting(int[][] grid) {
        Queue<Pairs> queue=new ArrayDeque<>();
        int time=0;
        int cntFresh=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==2){
                    queue.offer(new Pairs(i,j,0));
                } else if (grid[i][j]==1) {
                    cntFresh++;
                }
            }
        }

       while (!queue.isEmpty()){
           Pairs pairs=queue.poll();
           time=Math.max(time, pairs.time);
           checkRottenOranges(grid,queue, pairs.row, pairs.col,pairs.time);
       }
       return time;
    }

    private static void checkRottenOranges(int[][] grid, Queue<Pairs> queue, int x, int y,int time) {
        int[] rowDir = {-1,0,1,0};
        int[] colDir = {0,1,0,-1};
        for (int i = 0; i < 4; i++) {
            int nx=x+rowDir[i];
            int ny=y+colDir[i];
            if (nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length && grid[nx][ny]==1){
                queue.add(new Pairs(nx,ny,time+1));
                grid[nx][ny]=2;
            }
        }
    }


    public static void main(String[] args) {
        int[][] grid={
                {2,1,1},
                {1,1,0},
                {0,1,2}
        };
        System.out.println(orangesRotting(grid));
    }
}
