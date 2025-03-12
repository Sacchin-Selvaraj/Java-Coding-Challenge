package Java_Program;

public class MergeString {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder str=new StringBuilder();
        int n= Math.max(word1.length(), word2.length());
        for (int i = 0; i < n; i++) {
            if (i<word1.length())
                str.append(word1.charAt(i));

            if (i<word2.length())
                str.append(word2.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s1="abcd";
        String s2="pq";
        System.out.println(mergeAlternately(s1,s2));
    }
}
