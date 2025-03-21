package Java_Program;

public class HighestAltitude {

    public static int largestAltitude(int[] gain) {

        if (gain.length==1)
            return 0;

        int max=0;
        int temp=0;
        for (int i = 0; i < gain.length; i++) {
            temp=temp+gain[i];
            if (temp>max)
                max=temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
