package Java_Program;

public class FindSecondNumber {

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 9, 7, 1, 1, 3, 4, 9, 9, 1};

        int secondMin = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE, firstMax = Integer.MIN_VALUE, firstMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }
        System.out.println(secondMax);
        System.out.println("Second Min " + secondMin);
    }
}
