package Java_Program;

public class MinimumTimeToType {
    public static int minTimeToType(String word) {

     /*   int sum=0;
        char current='a';
        for (Character c:word.toCharArray()){
            int clockwise=clockwise(current,c);
            int anticlockwise=anticlockwise(current,c);
            sum=sum+Math.min(clockwise,anticlockwise);
            current=c;
        }
        return sum+word.length();

    }

    public static int clockwise(char current,char toFind){
      int i=0;
       while (current!=toFind){
           i++;
           current= (char) (current+i);
       }
       return i;

    }

    public static int anticlockwise(char current,char toFind){
        int i=0;
        char atLast='z';
        while (atLast!=toFind){
            i++;
            atLast = (char) (atLast-i);
        }
        int distance=Math.abs('a'-current);
        return i+distance;

    }
      */

        int cnt = word.length();
        char prev = 'a';
        for (int i = 0; i < word.length(); ++i) {
            char cur = word.charAt(i);
            int diff = Math.abs(cur - prev);
            cnt += Math.min(diff, 26 - diff);
            prev = cur;
        }
        return cnt;

    }

    public static void main(String[] args) {
        String word="bza";
        System.out.println(minTimeToType(word));
    }
}
