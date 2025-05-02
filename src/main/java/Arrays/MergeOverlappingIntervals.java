package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {

        int[][] arr={{1,3},{2,4},{2,6},{8,9},{9,11},{15,18},{16,17}};
        System.out.println(findOverlappingIntervals(arr));
        System.out.println(mergeOverlappingIntervals(arr));
    }

    private static List<List<Integer>> findOverlappingIntervals(int[][] arr) {
        List<List<Integer>> result=new ArrayList<>();
        int first=arr[0][0],second=arr[0][1];;
        for (int i = 1; i < arr.length; i++) {
            int start=arr[i][0];
            int end=arr[i][1];
            if (start<=second){
                second=Math.max(end,second);
            } else{
                List<Integer> list=List.of(first,second);
                result.add(list);
                first=arr[i][0];
                second=arr[i][1];
            }
            if (i==arr.length-1){
                List<Integer> list=List.of(first,second);
                result.add(list);
            }

        }
        return result;
    }


    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        //Optimal Solution
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
    }

}
