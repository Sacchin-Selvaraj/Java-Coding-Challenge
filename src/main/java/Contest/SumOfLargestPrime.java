package Contest;

import java.util.Comparator;
import java.util.TreeSet;

public class SumOfLargestPrime {

    public static long sumOfLargestPrimes(String s) {

        TreeSet<Long> set=new TreeSet<>(Comparator.reverseOrder());

        set=findSubString(s);
        long sum=0;
        if (set.isEmpty())
            return 0;
        else if (set.size()<3) {
            for (long num:set){
               sum+=num;
            }
        }else{
            int count=0;
            for (long num:set){
                sum+=num;
                if(count==2)
                    break;
                count++;
            }
        }
        return sum;
    }

    private static TreeSet<Long> findSubString(String s) {
        TreeSet<Long> set=new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s1=s.substring(i,j+1);
                long num=Long.parseLong(s1);
                if (isPrimeNumber(num)){
                    set.add(num);
                }
            }
        }
        return set;
    }

    private static boolean isPrimeNumber(long num) {
        if (num==1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="12234";
        System.out.println(sumOfLargestPrimes(s));
    }
}
