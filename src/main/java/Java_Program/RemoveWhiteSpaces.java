package Java_Program;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String sentence=" This  interview is for Java " +
                "   Backend     Developer ";

        System.out.println(sentence);

        String afterRemovingWhiteSpace = sentence.trim().replaceAll(" ","");

        System.out.println(afterRemovingWhiteSpace);
    }
}
