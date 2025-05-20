package Contest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MinimumSwaps {
    public static int minSwaps(int[] nums) {
        int n=nums.length;
        int[] digitSums=new int[n];
        for (int i = 0; i < n; i++) {
            digitSums[i]=sumOfDigits(nums[i]);
        }
        Integer[] indecies=new Integer[n];
        for (int q = 0; q < n; q++) {
            indecies[q]=q;
        }
        Arrays.sort(indecies, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (digitSums[a] != digitSums[b]) {
                    return Integer.compare(digitSums[a], digitSums[b]);
                } else {
                    return Integer.compare(nums[a], nums[b]);
                }
            }
        });
        int[] sortedArr=new int[n];
        for (int i = 0; i < n; i++) {
            sortedArr[i]=nums[indecies[i]];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }
        int swaps=0;
        for (int i = 0; i < n; i++) {

            if (nums[i]!=sortedArr[i]){
                int originalPos=map.get(sortedArr[i]);

                int temp=nums[i];
                nums[i]=nums[originalPos];
                nums[originalPos]=temp;

                map.put(nums[i],i);
                map.put(nums[originalPos],originalPos);

                swaps++;
            }
        }
        return swaps;
    }



    private static int sumOfDigits(int num) {
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={22,14,33,7};
        System.out.println(minSwaps(nums));
    }
}
