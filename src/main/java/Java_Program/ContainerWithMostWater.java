package Java_Program;

public class ContainerWithMostWater {

    public static int toGetMaximumWater(int[] num){

        int left=0;
        int right= num.length-1;
        int max=0,temp=0;

            while (left < right) {
                if (num[left] < num[right]) {
                    temp = num[left] * (right - left);
                    left++;

                } else {
                    temp = num[right] * (right - left);
                    right--;
                }

                if (temp > max)
                    max = temp;

            }

        return max;


    }

    public static void main(String[] args) {
        int[] num={1,8,6,2,5,4,1,2,1,8};

        System.out.println("Maximum Unit of Water :"+ContainerWithMostWater.toGetMaximumWater(num));



    }
}
