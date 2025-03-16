package Contest;

import java.util.HashSet;

public class Unique3Digit {
    public static int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i]==0)
                continue;
            for (int j = 0; j < n; j++) {
                if (i==j)
                    continue;
                for (int k = 0; k < n; k++) {
                    if (k==i||k==j)
                        continue;
                    if (digits[k]%2==0) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] digits={1,2,3,4};
        System.out.println(totalNumbers(digits));
    }
}
