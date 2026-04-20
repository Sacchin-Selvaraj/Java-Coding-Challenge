package CommonQuestions;

import java.util.stream.IntStream;

public class PowerOf2 {

    public static void main(String[] args) {
        int input=100;

        boolean isPowerOf2 = input > 0 &&
                 IntStream.iterate(1,i->i*2)
                .limit(31)
                .anyMatch(value -> value==input);

        System.out.println(isPowerOf2);
    }
}
