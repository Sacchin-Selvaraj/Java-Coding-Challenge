package Java_Program;

public class SelectionSort {

    public static void toSort(int[] num){
        System.out.print("Before Sorting :");
        for(int nums : num){
            System.out.print(nums+" ");
        }
        int temp=0;
        int minIndex=0;
        for(int i=0;i< num.length-1;i++){
            minIndex=i;
            for(int j=i+1;j< num.length;j++){
                if(num[minIndex]>num[j]) {
                    minIndex=j;
                }
            }
            temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;
            System.out.println();

            for(int nums : num){
                System.out.print(nums+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        int[] num={2,3,1,8,5,6,0};
        SelectionSort.toSort(num);

    }
}
