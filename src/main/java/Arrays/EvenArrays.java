package Arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenArrays {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 3};
        System.out.println(findEvenSubarrays(nums));

        Queue<Integer> rider=new ArrayDeque<>();

        rider.offer(1);
        rider.isEmpty();
        rider.poll();

        rider.stream().filter(num-> {
            if(num==0){
                return false;
            }
            if (num%2==0){
                return true;
            }
            return false;
        });

        String str="Sacc  hin";

        Map<Character,Long> frequencyMap = str.chars()
                .mapToObj(ch-> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(frequencyMap);

    }

    private static String findEvenSubarrays(int[] A) {
        if (A.length % 2 == 1) return "NO";

        if ((A[0]%2==0) && A[A.length-1]%2==0){
            return "YES";
        }
        return "NO";
    }
}

