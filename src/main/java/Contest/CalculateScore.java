package Contest;

import java.util.Arrays;
import java.util.Objects;

public class CalculateScore {
    public static long calculateScore(String[] instructions, int[] values) {
        int i=0;
        long result=0;
        while(i<values.length && i>=0 ){
            if (instructions[i].equals("visited"))
                return result;
            if(Objects.equals(instructions[i], "jump")){
                instructions[i]="visited";
                i=i+values[i];
            }else {
                result=result+values[i];
                instructions[i]="visited";
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values={2,1,3,1,-2,-3};
        String[] ints={"jump","add","add","jump","add","jump"};
        System.out.println(calculateScore(ints,values));
    }
}
