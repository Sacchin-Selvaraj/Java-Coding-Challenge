package CommonQuestions;

public class SumOfPrimes {
    public static void main(String[] args) {
        System.out.println(sumOfPrimesInRange(8));
    }
    public static int sumOfPrimesInRange(int n) {
//        String str = String.valueOf(n);
//        if(str.length()==1) return 0;
        int reversed = reverseInteger(n);

        System.out.println(reversed);
        int min = Math.min(n,reversed);
        int max = Math.max(n,reversed);

        int sum=0;
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                System.out.println(i);
                sum+=i;
            }
        }

        return sum;
    }

    public static int reverseInteger(int n){
        int res=0;

        while(n>0){
            int temp = n%10;
            res=(res*10)+temp;
            n/=10;
        }

        return res;
    }

    public static boolean isPrime(int n){
        if (n==1) return false;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
