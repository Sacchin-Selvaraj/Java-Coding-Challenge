package CommonQuestions;

public class PerfectSquare {

    public static void main(String[] args) {
        int number=16;

        for (int i = 1; i <= number/2; i++) {
            if (i*i==number){
                System.out.println("It is an Perfect number : " +i);
                return;
            }
        }
        System.out.println("It is not Perfect number");
    }
}
