package Java_Program;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int n=6;
        for (int k = 0; k < n; k++) {
            int temp = num[0];
            for (int i = 0; i < num.length - 1; i++) {
                num[i] = num[i + 1];
            }
            num[num.length - 1] = temp;
        }

        System.out.println(Arrays.toString(num));
    }
}
