package Java_Program;

public class Palindrome {

    public boolean Check(String str){
        String lowerCase = str.toLowerCase().trim().replaceAll("\\s","");
        System.out.println(lowerCase);
        String Result=lowerCase;
        int i=lowerCase.length()-1;
        int length=0;

        StringBuffer buff=new StringBuffer();
        while(i>=0){
            buff.append(lowerCase.charAt(i));
            i--;
        }
        System.out.println(buff.toString());
        if(Result.equals(buff.toString()))
            return true;
        else
            return false;

    }
    public static void main(String[] args) {

        String name = "Race a Car";
        Palindrome obj=new Palindrome();
        System.out.println(obj.Check(name));
    }
}
