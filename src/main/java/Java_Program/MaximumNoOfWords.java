package Java_Program;

public class MaximumNoOfWords {

    public static int mostWordsFound(String[] sentences) {


        int max=-1;
        for (String word:sentences){
            int count=0;
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i)==' '){
                    count++;
                }
                if(count>max)
                    max=count;
            }
        }
        return max+1;
    }


    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode","i think so too","this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));

    }
}
