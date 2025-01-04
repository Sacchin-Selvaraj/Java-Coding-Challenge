package Java_Program;

public class LengthofLastWord {

    public int Length(String str){
        if(str.length()==0||str.length()==1)
            return 1;
        String trimmed=str.trim();
        System.out.println(trimmed);
        int length=0;
        for (int i=trimmed.length()-1;i>=0;i--){
            if(trimmed.charAt(i)!=' ')
                length++;
            else
                break;
        }
        return length;
    }
    public static void main(String[] args) {

        String name=" a";
        LengthofLastWord obj=new LengthofLastWord();
        System.out.println(obj.Length(name));




    }
}
