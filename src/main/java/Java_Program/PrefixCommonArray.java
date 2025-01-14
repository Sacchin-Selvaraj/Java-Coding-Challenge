package Java_Program;

import java.util.Arrays;
import java.util.HashSet;

public class PrefixCommonArray {

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] result=new int[A.length];
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int count=0;
            set.add(B[i]);
            for (int j = 0; j <= i; j++) {
                if(set.contains(A[j])){
                    count++;
                }
            }
            result[i]=count;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] A={2,3,1};
        int[] B={3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A,B)));

    }
}
