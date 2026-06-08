package CommonQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();

        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0]<prev[1]){
                prev[1] = Math.max(prev[1],interval[1]);
            }else {
                list.add(prev);
                prev = interval;
            }
        }
        list.add(prev);

        return list.toArray(new int[list.size()][]);

    }
}
