package CommonQuestions;

public class Fibonnaci {


    public static void main(String[] args) {
        int first=0;
        int second=1;
        int n=10;
        System.out.println(first);
         while (n>0){
            System.out.println(second);
            int temp=first+second;
            first=second;
            second=temp;
            n--;
        }
    }
}
