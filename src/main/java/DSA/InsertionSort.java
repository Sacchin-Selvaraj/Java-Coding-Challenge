package DSA;

public class InsertionSort {
// Insertion Sort
    public static void toSort(int[] colour){

        for(int i=1;i< colour.length;i++){
            int key=colour[i];
            int j=i-1;
            while(j>=0&&colour[j]>key){
                colour[j+1]=colour[j];
                j--;
            }
            colour[j+1]=key;
        }
        for(int num:colour){
            System.out.print(num+" ");
        }

    }
    public static void main(String[] args) {
        int[] colour={5,4,3,2,6,9,4,2,1,0};
        toSort(colour);

    }
}
