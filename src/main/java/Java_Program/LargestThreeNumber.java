package Java_Program;

public class LargestThreeNumber {

    public static int findLargest(int[] num){

        int Max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>Max)
                Max=num[i];
        }
        return Max;

    }

    public static void main(String[] args) {

        int[] num={12,4,7,8,3,9};
        System.out.println("Largest of three number is :"+LargestThreeNumber.findLargest(num));

    }
}
