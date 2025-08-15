package Java_Program;

public class PowerFour {

    public static void main(String[] args) {
        int num=64;
        System.out.println(isPowerOfFour(num));
    }

    private static boolean isPowerOfFour(int n) {
//        if(num==1) return true;
//        int initialNum=4;
//        while (initialNum<= num){
//            if (initialNum== num){
//                return true;
//            }
//            initialNum*=4;
//        }
//        return false;

        if (n == 1)
            return true;

        // If 'n' is non-positive, it cannot be a power of four
        if (n <= 0)
            return false;

        // Calculate the logarithm of 'n' with base 4
        double logarithmBase4 = Math.log(n) / Math.log(4);
        System.out.println(Math.log(n));

        // Check if the result of the logarithmic operation is an integer
        return (logarithmBase4 == (int)logarithmBase4);
    }
}
