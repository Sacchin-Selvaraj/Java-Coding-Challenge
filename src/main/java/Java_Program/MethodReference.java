package Java_Program;

interface Car{
    String engine(String str);
}
class Hyundai{

    public static String convert(String str){
        if(str.length()<=3)
            str=str.toUpperCase();
        else
            str=str.toLowerCase();

        return str;
    }
}

class Myprinter{

    public void print(String str,Car c){
        str=c.engine(str);
        System.out.println(str);
    }
}

public class MethodReference {

    public static void main(String[] args) {
        String str="Sacch";
        Myprinter obj=new Myprinter();

        obj.print(str, Hyundai::convert);
    }
}
