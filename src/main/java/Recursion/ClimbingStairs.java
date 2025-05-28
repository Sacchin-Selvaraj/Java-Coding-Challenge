package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    // 2^N // TLE
    public static int climbStairs(int n) {
        List<Integer> list=new ArrayList<>();
        climbStairsByRecursion(n,0, list);
        return list.size();
    }

    private static void climbStairsByRecursion(int n, int index,List<Integer> list) {
        if (index>n)
            return;
        if (index==n){
            list.add(n);
            return;
        }
        for (int i = 1; i <= 2; i++) {
            climbStairsByRecursion(n,index+i,list);

        }
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairs(n));
    }
}
