package CommonQuestions;

import java.util.*;

public class Capgemini {
    public static void main(String[] args) {

        String[] arr = { "abcd",  "java",  "dcba",  "ajav",  "xyz",  "epam",  "pame",  "aepm" };
//
//        O/p:
//            [epam, pame, aepm] contains same character
//
//                [java, ajav] contains same character
//
//                [abcd, dcba] contains same character

        Map<String, List<String>> freqMap = new HashMap<>();

        for (String str:arr){

            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            String sortedStr = new String(tempChar);

            if (freqMap.containsKey(sortedStr)){
                List<String> stringList = freqMap.get(sortedStr);
                stringList.add(str);
            }else {
                List<String> newStringList = new ArrayList<>();
                newStringList.add(str);
                freqMap.put(sortedStr,newStringList);
            }
        }

        System.out.println(freqMap.values());
    }
}
