package Java_Program;

import java.util.Arrays;


public class MinimumOperations {

    public static int minimumOperations(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%3==0){

            }
            else {
                int temp=nums[i]%3;
                nums[i]=nums[i]-temp;
                count++;
            }
        }
        System.out.println("Output :"+ Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] nums={3,6,9};
        System.out.println(minimumOperations(nums));

        String[] name={"hi","hello"};
        if(name[1].contains("l")){
            System.out.println("Hello");
        }else{
            System.out.println("Hi");
        }
    }

    }




