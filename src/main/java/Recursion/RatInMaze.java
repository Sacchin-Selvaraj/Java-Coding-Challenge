package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 1}
        };
        int[][] mark = new int[maze.length][maze[0].length];
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        findthePath(res, path, maze, mark, 0, 0);
        System.out.println(res);
    }

    private static void findthePath(List<List<String>> res, List<String> path, int[][] maze, int[][] mark, int i, int j) {

        if (i == maze.length - 1 && j == maze.length - 1) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (isValidPath(maze, mark,i + 1, j)) {
            path.add("D");
            mark[i+1][j]=1;
            findthePath(res, path, maze, mark, i + 1, j);
            path.remove("D");
            mark[i+1][j]=0;
        }
        if (isValidPath(maze,mark, i, j - 1)) {
            path.add("L");
            mark[i][j-1]=1;
            findthePath(res, path, maze, mark, i, j - 1);
            path.remove("L");
            mark[i][j-1]=0;
        }
        if (isValidPath(maze, mark,i, j + 1)) {
            path.add("R");
            mark[i][j+1]=1;
            findthePath(res, path, maze, mark, i, j + 1);
            path.remove("R");
            mark[i][j+1]=0;
        }
        if (isValidPath(maze, mark,i - 1, j)) {
            path.add("U");
            mark[i-1][j]=1;
            findthePath(res, path, maze, mark, i -1, j);
            path.remove("U");
            mark[i-1][j]=0;
        }

    }

    private static boolean isValidPath(int[][] maze,int[][] mark, int i, int j) {

        if (i < 0 || j < 0 || i >= maze.length || j >= maze.length) return false;

        if (mark[i][j]==1) return false;
        return maze[i][j] != 0;

    }
}
