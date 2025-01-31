package Java_Program;

public class BreakingRecords {

    public static void main(String[] args) {

        int[] arr={10,5,20,20,4,5,2,25,1};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int highest_record=0,lowest_record=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
                lowest_record++;
            }
            if(arr[i]>max){
                max=arr[i];
                highest_record++;
            }
        }
        System.out.println("Minimum "+min+" Maximum "+max);
        System.out.println("\nHighest_Record "+(highest_record-1)+" lowest_Record "+(lowest_record-1));
    }
}
