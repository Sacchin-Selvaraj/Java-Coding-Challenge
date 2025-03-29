package Contest;

public class ReverseDegree {
    public static int reverseDegree(String s) {
        if (s.length()==1)
            return Math.abs(s.charAt(0)-123);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            int value=(s.charAt(i)-123)*(i+1);
            sum+=value;
        }
        return Math.abs(sum);
    }

    public static void main(String[] args) {

        String str="zaza";
        System.out.println(reverseDegree(str));
    }
}
