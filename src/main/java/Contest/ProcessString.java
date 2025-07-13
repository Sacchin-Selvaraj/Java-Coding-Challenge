package Contest;

public class ProcessString {
    public static String processStr(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isAlphabetic(ch)){
                str.append(ch);
            } else if (ch=='*') {
                if (!str.isEmpty()){
                    str.deleteCharAt(str.length()-1);
                }
            } else if (ch=='#') {
                String duplicate=str.toString();
                str.append(duplicate);
            }else {
                str.reverse();
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="z*#";
        System.out.println(processStr(s));
    }
}
