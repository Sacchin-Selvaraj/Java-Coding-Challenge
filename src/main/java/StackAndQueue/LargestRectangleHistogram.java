package StackAndQueue;

import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {

        int[] heights={3,2,10,11,5,10,6,3};
        System.out.println(findMaximumRectangleArea(heights));
    }

    public static int findMaximumRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maximumArea=-1;
        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                int temp=stack.pop();
                int previousSmaller=stack.isEmpty()?1:stack.peek();
                int calculatedArea=(i-temp)+(temp-previousSmaller-1);
                maximumArea=Math.max(maximumArea,heights[temp]*calculatedArea);
            }

            stack.push(i);
        }

        while ((!stack.isEmpty())){
            int nse = heights.length;
            int num=stack.pop();
            int pse=stack.isEmpty()?-1:stack.peek();
            maximumArea=Math.max(maximumArea,(nse-pse-1)*heights[num]);
        }

        return maximumArea;
    }
}
