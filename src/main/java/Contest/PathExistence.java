package Contest;

import java.util.Arrays;

public class PathExistence {
    public static boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
       int[] group=new int[n];
       group[0]=0;
        for (int i = 1; i < n; i++) {
            if (nums[i]-nums[i-1]<=maxDiff){
                group[i]=group[i-1];
            }else {
                group[i]=group[i-1]+1;
            }
        }
        boolean[] res=new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u=queries[i][0];
            int v=queries[i][1];
            res[i]=group[u]==group[v];
        }
        return res;
    }

    public static void main(String[] args) {
        int n=4;
        int[] nums={2,5,6,8};
        int maxDiff=2;
        int [][] queries={{0,1},{0,2},{1,3},{2,3}};
        System.out.println(Arrays.toString(pathExistenceQueries(n, nums, maxDiff, queries)));
    }
}
