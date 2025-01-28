package Java_Program;

public class BubbleSort {
    public static void toSort(int[] num){
        int temp=0;
        for(int i=0;i< num.length;i++){
            for(int j=i+1;j< num.length;j++){
                if(num[i]>num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int nums : num){
            System.out.print(nums+" ");
        }
    }
    public static void main(String[] args) {
        int[] num={2,3,1,8,5,6,0};
        BubbleSort.toSort(num);

    }
}
