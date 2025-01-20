package Java_Program;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {

    public static String intToRoman(int num) {

        StringBuilder res=new StringBuilder();
        while(num>0) {
            if (num > 3999)
                return " ";
            if (num > 1000) {
                res.append("M");
                num = num - 1000;
            } else if (num>=900&&num<1000) {
                res.append("CM");
                num=num-900;
            } else if (num>500 && num<900) {
                res.append("D");
                num-=500;
            } else if (num>100&&num<500) {
                res.append("C");
                num-=100;
            } else if (num>=90&&num<100) {
                res.append("XC");
                num=num-90;
            }else if (num>50&&num<90) {
                res.append("L");
                num-=50;
            }else if (num>10&&num<50) {
                res.append("X");
                num-=10;
            }else if (num>5&&num<10) {
                res.append("V");
                num-=5;
            }else if (num==4) {
                res.append("IV");
                num=num-4;
            }else if (num>=1&&num<5) {
                res.append("I");
                num-=1;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int num = 3999;
        System.out.println(intToRoman(num));
    }
}
