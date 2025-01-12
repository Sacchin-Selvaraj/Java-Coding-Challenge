package Java_Program;

public class ScoreOfAString {

    public static int scoreOfString(String s) {

        int sum=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)-s.charAt(i+1)<0) {
                int temp=s.charAt(i)-s.charAt(i+1);
                sum = sum +temp*-1;
                System.out.println(s.charAt(i) - s.charAt(i + 1));
            }else{
                sum = sum + (s.charAt(i) - s.charAt(i + 1));
                System.out.println(s.charAt(i) - s.charAt(i + 1));
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        String s="Sacchin";

        System.out.println(scoreOfString(s));

    }
}
