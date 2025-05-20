package Arrays;


public class SpiralMatrix {

    public static void main(String[] args) {
        int n = 10;
        findSpiralMatrix(n);
    }

    private static void findSpiralMatrix(int n) {
        int[][] ans = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                ans[top][j] = num++;
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                ans[j][right] = num++;
            }
            right--;
            if (top<=bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = num++;
                }
                bottom--;
            }
            if (left<=right){
            for (int j = bottom; j >= top; j--) {
                ans[j][left] = num++;
            }
            left++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
