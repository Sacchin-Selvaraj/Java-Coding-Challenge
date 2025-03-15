package Java_Program;

import java.util.HashMap;

public class NonRepeatingCharacters {

    private static int findnonRepeating(int[] num) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:num){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i:num){
            if (map.get(i)==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num={4,5,1,2,0,4,1,2};
        System.out.println(findnonRepeating(num));
    }


}
