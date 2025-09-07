package Contest;

public class MinimumOperationsToTransformString {

    public static void main(String[] args) {
        String s="a";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int minOperations=0;
        for (Character c:s.toCharArray()){
            if (c=='a')
                continue;
            int num=c%97;
            int min=26-num;
            if(min>minOperations){
                minOperations=min;
            }
        }
        return minOperations;
    }
}
