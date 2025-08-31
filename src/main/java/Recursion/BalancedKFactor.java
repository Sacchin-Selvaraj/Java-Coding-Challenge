package Recursion;

public class BalancedKFactor {
    int bestDiff = Integer.MAX_VALUE;
    int[] bestSplit;
    int n, k;

    public int[] minDifference(int n, int k) {
        this.n = n;
        this.k = k;

        bestSplit = new int[k];
        int[] res = new int[k];
        dfs(0, 1, res, n);
        return bestSplit;
    }
    private void dfs(int idx, int start, int[] res, int rem) {
        if (idx == k - 1) {
            res[idx] = rem;

            int diff = res[idx] - res[0];

            if (diff < bestDiff) {
                bestDiff = diff;
                bestSplit = res.clone();
            }
            return;
        }

        for (int f = start; f * f <= rem; f++) {
            if (rem % f == 0) {
                res[idx] = f;
                dfs(idx + 1, f, res, rem / f);
            }
        }
    }
    public static void main(String[] args) {
        BalancedKFactor bkf = new BalancedKFactor();
        int n = 44;
        int k = 3;
        int[] result = bkf.minDifference(n, k);
        System.out.print("Best split for n = " + n + " and k = " + k + " is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
