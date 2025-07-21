package Contest;

public class CheckDivisibility {

    public static boolean checkDivisibility(int n) {
        int sum=0,product=1;
        int temp=n;
        while (n>0){
            int num=n%10;
            n=n/10;
            sum+=num;
            product*=num;
        }
        int total=sum+product;
        if (temp%total==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=99;
        System.out.println(checkDivisibility(num));
    }
}
