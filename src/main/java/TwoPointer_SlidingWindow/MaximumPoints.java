package TwoPointer_SlidingWindow;

public class MaximumPoints {

    public static void main(String[] args) {
        int[] cards={6,8,3,4,56,5,5,0,9};
        int k=4;
        System.out.println(maximizePointsSlidingWindow(cards,k));
        System.out.println(maximizePoints(cards,k));
    }

    private static int maximizePoints(int[] cards, int k) {
        int left=k-1,right=cards.length-1,sum=0,maxPoint=Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum+=cards[i];
        }
        maxPoint=sum;
        while (left>=0){
            sum-=cards[left];
            sum+=cards[right];
            right--;
            left--;
            maxPoint=Math.max(maxPoint,sum);

        }
        return maxPoint;
    }

    private static int maximizePointsSlidingWindow(int[] cards, int k) {
        //slidingWindow
        int left=0,right=3,sum=0,maxPoint=Integer.MIN_VALUE;
        for (int i = 0; i < k-1; i++) {
            sum+=cards[i];
        }
        while (left<cards.length){
            sum+=cards[right];
            maxPoint=Math.max(maxPoint,sum);
            sum-=cards[left];
            left++;
            right=(right+1)%cards.length;

        }
        return maxPoint;
    }
}
