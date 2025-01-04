package Java_Program;

import java.util.Arrays;

public class LongestHarmonious {

    public static int findLongest(int[] num){
        Arrays.sort(num);
        int left=0;
        int Res=0;
        for(int i=1;i<num.length;i++){
            if(num[i]-num[left]==1)
                Res=Math.max(Res,i-left+1);
            if(num[i]-num[left]<=1)
                i++;
            else
                left++;
       }
        return Res;
    }

    public static void main(String[] args) {

        int[] num={1,3,2,2,5,2,3,7};
        System.out.println(LongestHarmonious.findLongest(num));

    }
}
