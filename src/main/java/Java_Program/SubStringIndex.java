package Java_Program;

public class SubStringIndex {

    private static int calculatesubstring(String s1, String s2) {
        int idx=s1.indexOf(s2.charAt(0));
        if (idx>=0)
          return idx;

        return -1;

    }
    public static void main(String[] args) {

        String s1="test123string";
        String s2="s23";
        System.out.println(calculatesubstring(s1,s2));
    }


}
