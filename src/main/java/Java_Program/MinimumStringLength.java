package Java_Program;

public class MinimumStringLength {

    public static int minLength(String s) {
        int count=0;
        int[] alpha=new int[26];
        for (char c:s.toCharArray()){
            alpha[c-'A']=1;
        }

        for (int i = 0; i < alpha.length-1; i++) {
            if(alpha[i]==1&&alpha[i+1]!=1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s="ABFCACDB";
        System.out.println(minLength(s));

    }
}
