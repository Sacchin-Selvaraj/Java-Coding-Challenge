package Contest;

import java.util.HashMap;
import java.util.Map;

public class HasPrime {
    public static boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (checkPrime(entry.getValue()))
                return true;
        }
        return false;
    }

    private static boolean checkPrime(Integer integer) {
        if (integer==1)
            return false;
        else if (integer==2 || integer==3)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(integer) ; i++) {
                if (integer%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums={3,0,3,6,3,3};
        System.out.println(checkPrimeFrequency(nums));
    }
}
