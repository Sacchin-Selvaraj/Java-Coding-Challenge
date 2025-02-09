package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMatrix {

    public static int[][] sortMatrix(int[][] grid) {

        List<Integer> bottom=new ArrayList<>();
        List<Integer> top=new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <= i; j++) {
                bottom.add(grid[i][j]);
            }
        }
        for (int i = 0; i < grid.length-1; i++) {
            for (int j = i+1; j < grid.length ; j++) {
                top.add(grid[i][j]);
            }
        }
        top=top.stream().sorted().toList();
        bottom=bottom.stream().sorted((o1, o2) -> o2-o1).toList();
        System.out.println(top);
        System.out.println(bottom);
        return null;

    }


    public static void main(String[] args) {
        int[][] grid={{1,7,3},{9,8,2},{4,5,6}};

        System.out.println(Arrays.toString(sortMatrix(grid)));
    }
}
