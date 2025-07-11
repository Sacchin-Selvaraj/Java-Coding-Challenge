package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Maze{
    int distance;
    int row;
    int col;

    public Maze(int distance, int row, int col) {
        this.distance = distance;
        this.row = row;
        this.col = col;
    }
}
public class ShortestPathInMaze {

    private static int findShortestPathMaze(int[][] maze, int[] source, int[] destination) {
        int n=maze.length;
        int m=maze[0].length;
        int[][] distance=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                distance[i][j]= (int) 1e9;
            }
        }
        distance[source[0]][source[1]]=0;
        Queue<Maze> queue=new ArrayDeque<>();
        queue.add(new Maze(0,source[0],source[1]));

        while (!queue.isEmpty()){
            Maze pair=queue.poll();
            int dist=pair.distance;
            int row=pair.row;
            int col=pair.col;
            int[] rowDirections={-1,0,1,0};
            int[] colDirections={0,1,0,-1};
            for (int i = 0; i < 4; i++) {
                int nx=row+rowDirections[i];
                int ny=col+colDirections[i];
                if (nx>=0 && nx<maze.length && ny>=0 && ny < maze[0].length && maze[nx][ny]!=0){
                    if (dist+1<distance[nx][ny]){
                        if (nx==destination[0] && ny==destination[1]) return dist+1;
                        distance[nx][ny]=dist+1;
                        queue.add(new Maze(dist+1,nx,ny));
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] maze={
                {1,1,1,1},
                {1,1,0,1},
                {1,1,1,1},
                {1,1,0,0},
                {1,0,0,1}
        };
        int[] source={0,0};
        int[] destination={2,3};
        System.out.println(findShortestPathMaze(maze,source,destination));
    }
}
