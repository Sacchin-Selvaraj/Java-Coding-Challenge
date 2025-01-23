package Java_Program;

public class ZigZag {

    public static String convert(String s, int numRows) {
        StringBuilder[] str=new StringBuilder[numRows];
        int n=s.length();
        for (int i = 0; i < str.length; i++) {
            str[i]=new StringBuilder();
        }
        char[] c=s.toCharArray();
        int i=0;
        while (i<n){
            for (int idx = 0; idx < numRows&& i<n; idx++) {
                str[idx].append(c[i++]);
            }
            for (int idx = numRows-2; idx>=1 && i<n; idx--) {
                str[idx].append(c[i++]);
            }
        }
        for (int j = 1; j < str.length; j++) {
            str[0].append(str[j]);
        }
        return str[0].toString();
    }

    public static void main(String[] args) {
        String s="PAYPALISHIRING";

        System.out.println(convert(s,5));
    }
}
