package Java_Program;

interface sunday{
    default void displayed(){
        System.out.println("hi");
    }
}
interface monday{
    default void displayed(){
        System.out.println("hello");
    }
}


class learn implements sunday,monday{

    @Override
    public void displayed() {
        sunday.super.displayed();
    }
}


public class CountSubstrings {
    static int count=0;
    public static long countSubstrings(String s) {

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
               // System.out.println(s.substring(i, j));
                count(s.substring(i, j));
            }
        }
        return count;
    }

    public static void count(String s){

        int n=s.charAt(s.length()-1)-48;
        if (n==0) {
            count--;
            n++;
        }
        int temp=Integer.parseInt(s);
        //System.out.println(n+"   "+temp);
        if(s.length()==1||temp%n==0)
            count++;
    }

    public static void main(String[] args) {
        String s="12936";
        System.out.println(countSubstrings(s));

        learn obj=new learn();
        obj.displayed();
    }
}
