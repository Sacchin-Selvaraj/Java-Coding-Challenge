package Contest;

import java.util.Arrays;

public class MaximumProduct {

    public static int maxProduct(int n) {
        String value = (String.valueOf(n));
        if (value.length() < 2) {
            return 0; // or handle edge case differently
        }
        int max = 0;
        for (int i = 0; i < value.length(); i++) {
            for (int j = i + 1; j < value.length(); j++) {
                int digit1 = value.charAt(i) - '0';
                int digit2 = value.charAt(j) - '0';
                int product = digit1 * digit2;
                max = Math.max(max, product);
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int n = 124;
        System.out.println(maxProduct(n));
        System.out.println(maxproduct1(n));
    }

    private static int maxproduct1(int n) {
        int ans=0;
        String value=String.valueOf(n);
        char[] arr=value.toCharArray();
        Arrays.sort(arr);
        char ch=arr[arr.length-1];
        char ch1=arr[arr.length-2];
        int product=(ch-'0')*(ch1-'0');
        ans=Math.max(ans,product);
        return ans;
    }
}
