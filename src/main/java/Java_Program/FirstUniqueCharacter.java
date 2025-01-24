package Java_Program;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstUniqueCharacter {

    public static Character findUnique(String s){

        Queue<Character> queue=new ArrayDeque<>();
        char res=' ';
        for (Character c:s.toCharArray()){
            if(!queue.isEmpty() && queue.peek()==c){
                queue.poll();
                continue;
            }
            queue.offer(c);
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        String s="QWERTYUIOREWWQTYUI";
        System.out.println(findUnique(s));
    }
}
