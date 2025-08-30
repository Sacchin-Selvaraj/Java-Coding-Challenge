package Contest;

import java.util.Map;
import java.util.TreeMap;

public class LeastFrequentdigit {

    public static void main(String[] args) {
        long num=723344511;
        System.out.println(getLeastFrequentDigit(num));
    }

    public static int getLeastFrequentDigit(long num) {
        Map<Integer,Integer> map=new TreeMap<>();
        while(num>0){
            int n= (int) (num%10);
            num/=10;
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int res=0,freq=Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()<freq){
                res=entry.getKey();
                freq=entry.getValue();
            }
        }
        return res;
    }
}
