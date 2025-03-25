package CommonQuestions;

import java.util.Arrays;

public class StringReplace {

    public static void main(String[] args) {
        String s1="OBvera chieves";
        String s2="Over";
        String s3="coding";

        String s4=s1.replaceAll(" ","");

        System.out.println(Arrays.toString(s1.split("\\s")));
        System.out.println(s4);

    }
}
