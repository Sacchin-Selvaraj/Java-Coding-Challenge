package StackAndQueue;

import static StackAndQueue.LargestRectangleHistogram.findMaximumRectangleArea;

public class MaximumRectangle {

    public static void main(String[] args) {
        int[][] grid={
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}
        };
        System.out.println(findMaximumArea(grid));
    }

    private static int findMaximumArea(int[][] grid) {
        int maximumArea=-1;
        int[] nums=new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==0) {
                    nums[j]=0;
                    continue;
                }
                nums[j]=nums[j]+grid[i][j];
            }
            maximumArea=Math.max(maximumArea,findMaximumRectangleArea(nums));
        }
       return maximumArea;
    }
}
