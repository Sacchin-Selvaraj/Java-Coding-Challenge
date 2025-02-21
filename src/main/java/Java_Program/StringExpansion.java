package Java_Program;

public class StringExpansion {

    public static void main(String[] args) {
        String str = "a1b10";
        int len = str.length();
        int number=0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch=str.charAt(i);
            number=0;
            while (i + 1 < len && Character.isDigit(str.charAt(i + 1))) {
                number=(number*10)+(str.charAt(i+1)-'0');
                i++;
            }
            for (int j = 0; j < number; j++) {
                stringBuffer.append(ch);
            }
        }
        System.out.println(stringBuffer);

    }
}
