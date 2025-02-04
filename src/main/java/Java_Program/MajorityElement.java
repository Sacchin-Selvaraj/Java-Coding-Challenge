package Java_Program;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> hashtable=new HashMap<>();
        for (int i:nums){
            hashtable.put(i, hashtable.getOrDefault(i,0)+1);
        }
        Iterator<Integer> iterator=hashtable.values().iterator();
        try {

        while (iterator.hasNext()){
            int i=iterator.next();
            if(i>nums.length/2)
                return getKeyByValue(hashtable,i);
        }} catch (Exception e) {
            System.out.println("hi");
        }
        return 1;
    }
    public static int getKeyByValue(HashMap<Integer, Integer> map, int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return 0; // Return null if the value is not found
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
