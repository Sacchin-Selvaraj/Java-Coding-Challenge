package Streams;


@FunctionalInterface
interface maths {
    int powerNumber(int i);
}

public class MathematicalOperation {

    public static void main(String[] args) {

        int i = 7;

        maths obj = num -> num * num;

        System.out.println(obj.powerNumber(i));

    }
}
