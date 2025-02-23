package Java_Program;

public class CheckIfDigitsAreEqual {

    public  static boolean hasSameDigits(String s) {
        int len=s.length();
        while (len>2){
            String str="";
            for (int i = 1; i < len; i++) {
                int num=(s.charAt(i)-'0'+s.charAt(i-1)-'0')%10;
                str=str+num;
            }
            s=str;
            len--;
        }
        return s.charAt(0)==s.charAt(1);
    }

    public static void main(String[] args) {
        String s="919";
        System.out.println(hasSameDigits(s));
    }
}
