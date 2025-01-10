package Java_Program;

import java.util.HashMap;

public class KeyPair {

    public static boolean findKeypair(int[] num,int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], i);
        }
        System.out.println(map);

        for (int i = 0; i < num.length; i++) {
            int diff = k - num[i];
            // Check if the diff exists in the map and ensure it's not the same element
            if (map.containsKey(diff) && map.get(diff) != i) {
                return true; // Pair found
            }
        }
        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] num={1,4,12,6,10,8};
        int k=22;
        System.out.println(findKeypair(num,k));
    }
}
