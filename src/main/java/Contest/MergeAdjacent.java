package Contest;

import java.util.*;

public class MergeAdjacent {
    public static void main(String[] args) {
        int[] nums={65536,32768,16384,8192,4096,2048,1024,512,256,128,64,32,16,8,4,2,1,1};
        System.out.println(mergeAdjacent(nums));
    }
    public static List<Long> mergeAdjacent(int[] nums) {

        Stack<Long> stack=new Stack<>();

        for(int i=0;i<nums.length;i++){
            if(i==0){
                stack.push((long)nums[i]);
                continue;
            }
            long num=nums[i];

            if(num==stack.peek()){
                Long newNum;
                while(true){
                    Long popNum=stack.pop();
                    newNum=popNum+popNum;
                    if(stack.isEmpty() || !newNum.equals(stack.peek())){
                        break;
                    }
                }
                stack.push(newNum);

            }else{
                stack.push(num);
            }
        }

        return stack.stream().toList();

    }
}
