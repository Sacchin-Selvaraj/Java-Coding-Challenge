package CommonQuestions;

public class ReverseStringBy2 {
    public static void main(String[] args) {
        String str = "manikandanv"; // aminakdnna

        StringBuilder builder = new StringBuilder();

        for(int i=0;i<str.length();i=i+2){
            int end = Math.min(i + 2, str.length());
            String temp = str.substring(i, end);
            String reversedString = new StringBuilder(temp).reverse().toString();
            builder.append(reversedString);
        }

//        for (int i = 0; i < str.length(); i += 2) {
//
//            if (i + 1 < str.length()) {
//                result.append(str.charAt(i + 1))
//                        .append(str.charAt(i));
//            } else {
//                result.append(str.charAt(i));
//            }
//        }

        System.out.println(builder);
    }
}
