package Java_Program;



public class CoomonWealth {

    public static int maximumWealth(int[][] accounts) {

        int max=Integer.MIN_VALUE;

        for(int[] cust:accounts){
            int sum=0;
            for (int i:cust){
                sum=sum+i;
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] nums={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(nums));

    }
}
