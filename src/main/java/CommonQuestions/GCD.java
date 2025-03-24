package CommonQuestions;

public class GCD {

    private static int findGCD(int num1, int num2) {

        int min=Math.max(num1,num2);
        int result=0;
        for (int i = 1; i <= min; i++) {
            if (num1%i==0&&num2%i==0){
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num1=12;
        int num2=18;
        System.out.println(findGCD(num1,num2));
    }


}
