package Java_Program;

public class FindOccuranceRange {

    public static void main(String[] args) {

        String str="ZOHOCORPORATION";
        String str2="PORT";
        int min=Integer.MAX_VALUE,max=-1;
        for (int i = 0; i < str2.length(); i++) {
            min=Math.min(min,str.indexOf(str2.charAt(i)));
            max=Math.max(max,str.indexOf(str2.charAt(i)));
        }
        System.out.println(str.substring(min,max+1));
    }
}
