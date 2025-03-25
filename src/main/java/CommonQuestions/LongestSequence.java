package CommonQuestions;

public class LongestSequence {

    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 20, 21,22};
        System.out.println(findConsecutiveNumber(arr));
        System.out.println(findConsecutiveNumberByTwoPointer(arr));
    }
    private static int findConsecutiveNumberByTwoPointer(int[] arr) {
        int res=0;
        int count=0;
        int left=0;
        int i=1;
        for (int a = 1; a < arr.length; a++) {
            if (arr[left]+i==arr[a]){
                count++;
                i++;
            }else {
                res=Math.max(res,count);
                left=a;
                count=0;
                i=1;
            }
        }
        res=Math.max(res,count);
        return res+1;
    }

    private static int findConsecutiveNumber(int[] arr) {

        int res=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (num+1==arr[j]){
                    count++;
                } else
                    break;
            }
            res=Math.max(res,count);
        }
        return res+1;
    }
}
