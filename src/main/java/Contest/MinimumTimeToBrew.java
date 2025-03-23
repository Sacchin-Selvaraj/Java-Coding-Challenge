package Contest;

import java.util.Arrays;

public class MinimumTimeToBrew {

    public static long minTime(int[] skill, int[] mana) {
        long[] endTime = new long[skill.length];
        Arrays.fill(endTime, 0);
        for(int i = 0; i < mana.length; ++i){
            long t = 0, maxDiff = 0;
            for(int j = 0; j < skill.length; ++j){
                maxDiff = Math.max(maxDiff, endTime[j] - t);
                t += (long)skill[j] * (long)mana[i];
                endTime[j] = t;
            }
            for(int j = 0; j < skill.length; ++j) endTime[j] += maxDiff;
        }
        return endTime[endTime.length-1];
    }
    public static void main(String[] args) {
        int[] skill={1,5,2,4};
        int[] mana={5,1,4,2};
        System.out.println(minTime(skill,mana));
    }
}
