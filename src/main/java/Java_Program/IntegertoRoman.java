package Java_Program;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {

    public static String intToRoman(int num) {

        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        return null;
    }

    public static void main(String[] args) {
        int num = 58;
        System.out.println(intToRoman(num));
    }
}
