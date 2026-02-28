package Contest;

import java.util.*;

public class SmallestPair {

    public  static int[] minDistinctFreqPair(int[] nums) {

        Map<Integer,Integer> freqMap=new HashMap<>();
        TreeSet<Integer> set=new TreeSet<>();

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
            set.add(num);
        }
        String str="sac";

        
        int a=-1,b=-1;
        int freqA=0,freqB=0;

        for(int num:set){
            if(a==-1 && freqA==0){
                int x=freqMap.get(num);
                a=num;
                freqA=x;
                continue;
            }

            if(freqMap.get(num)==freqA){
                continue;
            }else{
                b=num;
                freqB=freqMap.get(num);
                break;
            }

        }

        if(b==-1){
            return new int[] {-1,-1};
        }

        return new int[] {a,b};

    }

    public static void main(String[] args) {
        int[] nums={1,5};
        System.out.println(Arrays.toString(minDistinctFreqPair(nums)));
    }
}
