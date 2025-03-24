package CommonQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyString {

    public static void main(String[] args) {

        String str="Sacchin";

        calculateFrequency(str);
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }

    private static void calculateFrequency(String str) {

        int[] freq=new int[str.length()];
        Arrays.fill(freq,1);
        char[] letters=str.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            for (int j = i+1; j < letters.length; j++) {
                if (letters[i]==letters[j]){
                    freq[i]++;
                    letters[j]='0';
                }

            }
        }
        for (int i = 0; i < letters.length; i++) {

            if (letters[i]!='0'){
                System.out.println(letters[i] +" : "+freq[i]);
            }

        }
    }
}
