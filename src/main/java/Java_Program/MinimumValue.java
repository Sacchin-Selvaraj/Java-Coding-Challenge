package Java_Program;

import java.util.Arrays;
import java.util.LinkedList;

public class MinimumValue {

    public static void main(String[] args) {
        int[] num={9,1,4};
        Arrays.sort(num);
        int totalrope=0;
        LinkedList<Integer> list=new LinkedList<>();
        int minlength=num[0];
        for (int i = 1; i < num.length; i++) {

            if(num[i]-minlength>0){
                list.add(num.length-i);
                minlength=num[i];
            }
        }
        System.out.println("Output:"+list);
    }
}
