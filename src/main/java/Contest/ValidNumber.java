package Contest;

public class ValidNumber {
    public static void main(String[] args) {
        System.out.println(validDigit(232,2));
    }

    public static boolean validDigit(int n, int x) {
        String str = String.valueOf(n);
        int firstDigit = Integer.parseInt(String.valueOf(str.charAt(0)));
        if (firstDigit==x){
            return false;
        }

        while (n>0){
            int temp = n%10;
            if (temp==x) return true;
            n=n/10;
        }

        return false;
    }
}
