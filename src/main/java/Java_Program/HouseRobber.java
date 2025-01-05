package Java_Program;

public class HouseRobber {

    public static int rob(int[] nums) {

        int a=0,b=0;
        for (int i = 0; i < nums.length; i=i+2) {
            a=a+nums[i];
        }
        for (int i = 1; i < nums.length; i=i+2) {
            b=b+nums[i];
        }

        if(a>b){
            return a;
        }else {
            return b;
        }


    }

    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};

        System.out.println(rob(nums));
    }
}
