package Java_Program;

public class RemoveDuplicates {

    public static int toRemoveDuplicate(int[] num){
        int j=0;
        for (int i = 1; i < num.length ; i++) {
            if(num[j]!=num[i]){
                j++;
                num[j]=num[i];
            }
        }
        return j+1;

    }
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j == 1 || nums[i] != nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }


    public static void main(String[] args) {
        int[] num={1,2,2,2,2,2,2,3,5};
        System.out.println(toRemoveDuplicate(num));

    }
}
