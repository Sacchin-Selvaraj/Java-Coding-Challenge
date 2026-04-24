package Interview;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String arr[] = { "abcd",  "java",  "dcba",  "ajav",  "xyz",  "epam",  "pame",  "aepm" };
        Map<String, List<String>> freqMap = new HashMap<>();

        for (String str:arr){

            String temp = str;
            char[] tempChar = temp.toCharArray();
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
