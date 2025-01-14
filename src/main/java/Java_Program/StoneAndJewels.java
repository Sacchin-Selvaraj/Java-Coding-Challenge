package Java_Program;

import java.util.HashMap;
import java.util.HashSet;

public class StoneAndJewels {

    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> hashSet=new HashSet<>();

        for (char c:stones.toCharArray()){
            hashSet.add(c);
        }
        System.out.println(hashSet);

        return 1;
    }

    public static void main(String[] args) {
        String jewel="aA";
        String stones="aAAbbBB";
        System.out.println("Output : "+numJewelsInStones(jewel,stones));

    }
}
