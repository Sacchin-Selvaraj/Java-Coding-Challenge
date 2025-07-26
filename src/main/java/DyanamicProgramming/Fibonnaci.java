package DyanamicProgramming;

import java.util.Arrays;

public class Fibonnaci {

    public static void main(String[] args) {
        int num=29;
        int[] dp=new int[num+1];
        Arrays.fill(dp,-1);
        System.out.println(findFibonnaci(num,dp));
    }

    private static int findFibonnaci(int num,int[] dp) {
        if (num<=1)
            return num;
        if (dp[num]!=-1)
            return dp[num];
        return dp[num]=findFibonnaci(num-1,dp)+findFibonnaci(num-2,dp);
    }
}
