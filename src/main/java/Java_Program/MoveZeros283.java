package Java_Program;

import java.util.Arrays;

public class MoveZeros283 {

    public static void moveZeroes(int[] nums) {

        if(nums.length==0||nums.length==1)
            System.out.println("Output :"+0);
           //System.exit(0);

        int i=0;
        int tail= nums.length-1;
        while(i<tail){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[tail];
                nums[tail]=temp;
                tail--;
            }
            i++;
            System.out.println("Output :"+ Arrays.toString(nums));

        }


    }

    public static void main(String[] args) {
        int[] num={0,1,0,3,8};
        MoveZeros283.moveZeroes(num);

    }
}
