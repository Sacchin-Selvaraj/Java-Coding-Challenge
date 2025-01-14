package Java_Program;

import java.util.HashMap;
import java.util.HashSet;

public class StoneAndJewels {

    public static int numJewelsInStones(String jewels, String stones) {

        int count=0;
        HashSet<Character> hashSet=new HashSet<>();

        for (char c:stones.toCharArray()){
            hashSet.add(c);
        }
        System.out.println(hashSet);

        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if(stones.charAt(i)-jewels.charAt(j)==0)
                    count=count+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewel="ebd";
        String stones="bbb";
        System.out.println("Output : "+numJewelsInStones(jewel,stones));

    }
}
