package Java_Program;

public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] num){
        int j=0;
        for (int n:num){
            if(j<2||n>num[j-2]){
                num[j++]=n;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        int[] num={1,2,2,2,2,2,2,3,5};
        System.out.println(removeDuplicates(num));

    }

}
