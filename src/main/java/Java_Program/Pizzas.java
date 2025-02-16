package Java_Program;

import java.util.Arrays;

public class Pizzas {
    public static long maxWeight(int[] p) {
        Arrays.sort(p);
        int n = p.length;
        int m = p.length / 4;
        int odd = (m + 1) / 2;
        int even = m - odd;

        long ans = 0;
        int left = n - 1;
        int right = 0;

        for(int i = 0; i < odd; i++) {
            ans += p[left];
            left--;
            right += 3;
        }
        for(int i = 0; i < even; i++) {
            int first = p[left];
            left--;
            int sec = p[left];
            left--;
            ans += sec;
            right += 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] p={1,2,3,4,5,6,7,8};
        System.out.println(maxWeight(p));
    }

}
