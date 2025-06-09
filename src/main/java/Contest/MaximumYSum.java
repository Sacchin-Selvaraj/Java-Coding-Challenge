package Contest;

import java.util.*;

public class MaximumYSum {
    public static int maxSumDistinctTriplet(Integer[] x, Integer[] y) {
        int n = x.length;
        List<int[]> pairs = new ArrayList<>();

        // Combine x and y into pairs (y, x) for sorting by y in descending order
        for (int i = 0; i < n; i++) {
            pairs.add(new int[]{y[i], x[i]});
        }

        // Sort in descending order of y
        pairs.sort((a, b) -> b[0] - a[0]);

        Set<Integer> distinctX = new HashSet<>();
        int sum = 0;
        int count = 0;

        for (int[] pair : pairs) {
            int currentY = pair[0];
            int currentX = pair[1];

            if (!distinctX.contains(currentX)) {
                sum += currentY;
                distinctX.add(currentX);
                count++;

                if (count == 3) {
                    return sum;
                }
            }
        }

        return -1;
    }

    public int maxSumDistinctTriplet(int[] x, int[] y) {
        int n=x.length;
        int[][] arr=new int[n][n];
        Set<Integer> list=new HashSet<>();
        int sum=0,count=0;
        for (int i = 0; i < x.length; i++) {
            arr[i][0]=y[i];
            arr[i][1]=x[i];
        }
        Arrays.sort(arr,(o1, o2) -> o2[0]-o1[0]);
        for (int[] num:arr){
            if (list.isEmpty()){
                sum+=num[0];
                list.add(num[1]);
                count++;
            }
            else if (!list.contains(num[1])){
                sum+= num[0];
                list.add(num[1]);
                count++;
            }
            if (count==3)
                break;
        }
        return count==3?sum:-1;
    }

    public static void main(String[] args) {
        Integer[] x={9,9,14,16};
        Integer[] y={4,12,15,15};
        System.out.println(maxSumDistinctTriplet(x,y));
    }
}
