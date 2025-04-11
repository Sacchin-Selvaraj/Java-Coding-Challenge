package Java_Program;

public class CountFrequency {

    public static void main(String[] args) {

        String str="AABCCA";
        System.out.println(findFrequency(str));
    }

    private static String findFrequency(String str) {
//        StringBuilder stringBuilder=new StringBuilder();
//        int count=1;
//        int left=0,right=1;
//        for (int i = 0; i < str.length(); i++) {
//            if (right>str.length()-1)
//                break;
//            if (str.charAt(left)==str.charAt(right)){
//                count++;
//                right++;
//            }else {
//                stringBuilder.append(count);
//                stringBuilder.append(str.charAt(left));
//                left=right;
//                right++;
//                count=1;
//            }
//        }
//        return stringBuilder.toString();
        if (str.isEmpty()) return ""; // Edge case

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        int left = 0, right = 1;

        while (right <= str.length()) { // Modified condition
            if (right == str.length() || str.charAt(left) != str.charAt(right)) {
                stringBuilder.append(count).append(str.charAt(left));
                left = right;
                count = 1;
            } else {
                count++;
            }
            right++;
        }
        return stringBuilder.toString();
    }
}
