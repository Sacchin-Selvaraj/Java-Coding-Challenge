package Java_Program;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] num={1,2,3,2,1,3,4};
        int nums=0;
        for (int i = 1; i < num.length; i++) {
            nums=nums^num[i];
        }
        System.out.println(nums);
    }
}
