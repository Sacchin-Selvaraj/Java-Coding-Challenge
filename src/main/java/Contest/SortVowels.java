package Contest;

import java.util.*;
import java.util.stream.Collectors;

public class SortVowels {

    public static void main(String[] args) {
        System.out.println(sortVowels("aeiaaioooa"));
    }

    public static String sortVowels(String s) {
        Map<Character,Integer> freqMap=new HashMap<>();
        Map<Character,Integer> freqIdx=new HashMap<>();
        int k=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
                freqIdx.putIfAbsent(ch,k);
            }
            k++;
        }

        List<Character> characterList = new ArrayList<>(freqMap.keySet());

        characterList.sort((a,b) -> {
            if (!freqMap.get(a).equals(freqMap.get(b))){
                return freqMap.get(b)-freqMap.get(a);
            }
            return freqIdx.get(a)-freqIdx.get(b);
        } );


        Queue<Character> characterQueue = new ArrayDeque<>();

        for (char ch:characterList){
            int n=freqMap.get(ch);
            for (int i = 0; i < n; i++) {
                characterQueue.add(ch);
            }
        }

        char[] result=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char ch=result[i];
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') && !characterQueue.isEmpty()){
                result[i]=characterQueue.poll();
            }
        }
        return new String(result);

    }
}
