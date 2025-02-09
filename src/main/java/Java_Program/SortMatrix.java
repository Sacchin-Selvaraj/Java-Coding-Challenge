package Java_Program;

import java.util.ArrayList;
import java.util.*;

public class SortMatrix {

    public static void sortMatrix(int[][] grid) {

        int n = grid.length;
        int m= grid[0].length;

        Map<Integer,ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int key = i-j;
                map.putIfAbsent(key,new ArrayList<>());
                map.get(key).add(grid[i][j]);

            }
        }

        for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
            int key = entry.getKey();
            ArrayList<Integer> list = entry.getValue();
            if(key>=0){
                Collections.sort(list,Collections.reverseOrder());
            }else{
                Collections.sort(list);
            }

        }

        for(int i = n-1;i>=0;i--){
            for(int j  = m-1;j>=0;j--){
                int key = i-j;
                ArrayList<Integer> d = map.get(key);

                grid[i][j] = d.remove(d.size()-1);
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid={{1,7,3},{9,8,2},{4,5,6}};
        sortMatrix(grid);
    }
}
