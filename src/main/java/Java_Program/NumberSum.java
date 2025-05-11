package Java_Program;

public class NumberSum {

    public static void main(String[] args) {

        int num=988;
        System.out.println(findNumberSum(num));
    }

    private static int findNumberSum(int num) {
        String s=String.valueOf(num);

        while (s.length()!=1){
            int temp=0;
            for (int i = 0; i < s.length(); i++) {
                temp+=s.charAt(i)-'0';
            }
            s=String.valueOf(temp);
        }
        return Integer.parseInt(s);
    }
}
