package Contest;

import java.util.*;

public class MinimumOperationsRequiredToMakeParity {

    public static void main(String[] args) {
        int[] nums={-8,6,3};
        System.out.println(Arrays.toString(makeParityAlternating(nums)));
    }
    public static int[] makeParityAlternating(int[] nums) {

        if(nums.length==1){
            return new int[]{0,0};
        }

        int[] temp=nums;

        Arrays.stream(temp).boxed().distinct().sorted(Comparator.reverseOrder()).skip(3).findFirst();

        Result even=solve(temp,0);
        Result odd=solve(temp,1);

        if(even.operations<odd.operations){
            return new int[]{even.operations,even.range};
        }else if(even.operations>odd.operations){
            return new int[]{odd.operations,odd.range};
        }else{
            return new int[]{even.operations,Math.min(even.range,odd.range)};
        }

    }

    public static Result solve(int[] nums, int parity){
        int operations=0;
        List<Integer> possibleValues=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int expectedParity = i%2==0?parity:1-parity;
            int num=Math.abs(nums[i]);
            if(num%2==expectedParity){
                possibleValues.add(nums[i]);
            }else{
                operations++;
                int option1=nums[i]+1;
                int option2=nums[i]-1;

                if (possibleValues.isEmpty()) {
                    possibleValues.add(option1);
                } else {
                    int prev = possibleValues.get(possibleValues.size() - 1);

                    if (Math.abs(option1 - prev) <= Math.abs(option2 - prev)) {
                        possibleValues.add(option1);
                    } else {
                        possibleValues.add(option2);
                    }
                }
            }
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:possibleValues){
            if(x>max){
                max=x;
            }

            if(x<min){
                min=x;
            }
        }

        return new Result(operations,max-min);
    }
}

class Result{
    public int operations;
    public int range;

    public Result(int operations,int range){
        this.operations=operations;
        this.range=range;
    }
}