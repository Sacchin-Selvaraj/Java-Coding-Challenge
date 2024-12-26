package Java_Program;

public class ExcelColumn {

    public static String isString(int Column){

        if(Column<0)
            return "Enter a Valid Number";
        StringBuffer str=new StringBuffer();
        while(Column>0){
             Column--;
            char c= (char) ('A'+Column%26);
            str.insert(0,c);
            Column=Column/26;

        }


        return str.toString();
    }

    public static int toNumber(String str){

        if(str.length()==0)
            return 0;
        int result=0;
        for(char c:str.toCharArray()){

            result=result*26+(c-'A'+1);

        }
        return result;


        }

    public static void main(String[] args){
        int Column=45;
        String Str="YZ";

        System.out.println(ExcelColumn.isString(Column));
        System.out.println(ExcelColumn.toNumber(Str));

    }
}
