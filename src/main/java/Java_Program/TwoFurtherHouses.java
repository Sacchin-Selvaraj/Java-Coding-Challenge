package Java_Program;

public class TwoFurtherHouses {
    public static int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i+1; j < colors.length ; j++) {
                if (colors[i] != colors[j]) {
                    if (Math.abs(j-i)>max){
                        max=Math.abs(j-i);
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] colors = {1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }
}
