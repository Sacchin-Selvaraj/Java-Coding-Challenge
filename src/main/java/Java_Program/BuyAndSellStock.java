package Java_Program;

import java.util.Arrays;

public class BuyAndSellStock {
     public static int MaxProfit(int[] arr) {
         int[] temp = new int[2];
         temp = getMinValue(arr);
         System.out.println(Arrays.toString(temp));

         int max = 0;
             for (int j = temp[1] + 1; j < arr.length; j++) {
                 if (arr[j] - arr[temp[1]] > max) {
                     max = arr[j] - arr[temp[1]];
                 }
             }

         return max;

     }

    private static int[] getMinValue(int[] arr) {
         int min=Integer.MAX_VALUE;
         int idx=0;
         for(int i=0;i< arr.length;i++){
             if(min>arr[i]){
                 min=arr[i];
                 idx=i;
             }
         }
         return new int[]{min,idx};
    }

    public static void main(String[] args) {
        int[] prices={1,2};
//        System.out.println("Enter the Profit value");
//        Scanner sc=new Scanner(System.in);
//        int k= sc.nextInt();
        int Output=BuyAndSellStock.MaxProfit(prices);
        System.out.println("MaxProfit :"+Output);

    }
}
//class Solution {
//    public int maxProfit(int[] prices) {
//        if (prices == null || prices.length < 2) {
//            return 0;
//        }
//
//        int minPrice = Integer.MAX_VALUE; // To track the minimum price encountered so far
//        int maxProfit = 0; // To track the maximum profit
//
//        for (int price : prices) {
//            // Update the minimum price if the current price is lower
//            if (price < minPrice) {
//                minPrice = price;
//            }
//            // Calculate profit if we sell at the current price and update maxProfit
//            else if (price - minPrice > maxProfit) {
//                maxProfit = price - minPrice;
//            }
//        }
//
//        return maxProfit;
//    }
//
//
//}
