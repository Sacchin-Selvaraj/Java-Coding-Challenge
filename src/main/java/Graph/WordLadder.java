package Graph;

import java.util.*;

class Word{
    String first;
    int second;

    public Word(String first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        Set<String> set = new HashSet<>(wordList);
        Queue<Word> queue=new ArrayDeque<>();
        queue.add(new Word(beginWord,1));
        set.remove(beginWord);

        while (!queue.isEmpty()){
            Word pair=queue.poll();
            String value=pair.first;
            int steps=pair.second;
            if (value.equals(endWord)) return steps;

            for (int i = 0; i < value.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedArray=value.toCharArray();
                    replacedArray[i]=ch;
                    String newWord=new String(replacedArray);
                    if (set.contains(newWord)){
                        set.remove(newWord);
                        queue.add(new Word(newWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord="hit";
        String endWord="cog";
        String[] words= {"hot","dot","dog","lot","log","cog"};
        List<String> wordlist= Arrays.stream(words).toList();
        System.out.println(ladderLength(beginWord,endWord,wordlist));
    }
}
