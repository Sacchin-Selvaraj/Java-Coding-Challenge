package Contest;

import java.util.*;
public class CheckPermutation {

    public static boolean isDigitorialPermutation(int n) {
        Map<Integer,Integer> freqMap=Map.of(0,1,1,1,2,2,3,6,4,24,5,120,6,720,7,5040,8,40320,9,362880);

        int num=n;
        int sum=0;
        while(num>=1){
            int temp=num%10;
            sum+=freqMap.get(temp);
            num/=10;
        }

        String str1=String.valueOf(n);
        String str2=String.valueOf(sum);

        if(str2.charAt(0)=='0'){
            return false;
        }

        if(str1.length()==str2.length() && checkPermutation(n,sum)) return true;

        return false;
    }

    public static boolean checkPermutation(int n, int sum){

        int sum1=0,sum2=0;
        int temp1=n,temp2=sum;
        while(temp1>=1){
            int num=temp1%10;
            sum1+=num;
            temp1/=10;
        }

        while(temp2>=1){
            int num=temp2%10;
            sum2+=num;
            temp2/=10;
        }

        if(sum1==sum2 ) return true;

        ArrayDeque<Integer> deque=new ArrayDeque<>();



        return false;
    }

    public static void main(String[] args) {

        System.out.println(isDigitorialPermutation(254));
    }


}


