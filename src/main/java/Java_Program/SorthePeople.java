package Java_Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SorthePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; ++i) {
            map.put(heights[i], names[i]);
        }
        for (int i = 1; i <heights.length; i++) {
            int Key=heights[i];
            int j=i-1;
            while (j>=0&&heights[j]<Key){
                heights[j+1]=heights[j];
                j--;
            }
            heights[j+1]=Key;
        }
        for (int i = 0; i < heights.length; ++i) {
            names[i] = map.get(heights[i]);
        }

        System.out.println(Arrays.toString(heights));
        return names;
    }

    public static void main(String[] args) {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};

        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
