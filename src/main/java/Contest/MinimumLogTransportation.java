
package Contest;

public class MinimumLogTransportation {

    public static long minCuttingCost(int n, int m, int k) {
        long cost=1;
        if (n>k){
            int mod=n%k;
            if (mod==0) {
                mod = n - k;
                n=n-k;
            }
            else
                n=n-mod;
            cost=cost*n*mod;
        } else if (m>k) {
            int mod=m%k;
            if (mod==0) {
                mod = m - k;
                m=m-k;
            }
            else
                 m=m-mod;
            cost=cost*m*mod;
        }else {
            return 0;
        }
        return cost;

    }

    public static void main(String[] args) {
        int n=49898;
        int m=109372;
        int k=62703;
        System.out.println(minCuttingCost(n,m,k));
    }
}
