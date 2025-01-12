package Java_Program;

public class ReverseInteger {

    public int reverse(int x) {
        int sum=0;
        while(x!=0){
            int temp=x%10;
            x=x/10;
            sum=(sum*10+temp);

        }

        System.out.println("Output :"+sum);
        if(sum>21474836l)
            return 0;
        else
            return sum;
    }

    public static void main(String[] args) {

        int x=1534236469;
        ReverseInteger obj=new ReverseInteger();
        obj.reverse(x);
    }
}
