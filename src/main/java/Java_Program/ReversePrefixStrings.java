package Java_Program;

import java.util.Stack;

public class ReversePrefixStrings {

    public static String reversePrefix(String word, char ch) {

        int left=0,count=0,cut=0;
        StringBuffer stringBuffer=new StringBuffer();
        Stack<Character> stack=new Stack<>();
        for (Character c:word.toCharArray()){
            stack.add(c);
            count++;
            if(c==ch){
                cut=1;
                break;
            }

        }
        if(cut==0)
            return word;
        while (!stack.isEmpty())
            stringBuffer.append(stack.pop());

        for (int i = count; i < word.length(); i++) {
            stringBuffer.append(word.charAt(count++));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String word="Sacchin";
        char ch='d';

        System.out.println(reversePrefix(word,ch));
    }
}
