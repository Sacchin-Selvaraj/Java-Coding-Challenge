package BinarySearch;

public class AllocateBooks {

    private static int allocateBooks(int[] books, int students) {
     int maxNum=Integer.MIN_VALUE,sumNum=0;
     int n=books.length;
        for (int i = 0; i < n; i++) {
            maxNum=Math.max(maxNum,books[i]);
            sumNum+=books[i];
        }
        int left=maxNum,right=sumNum;
        while (left<=right){
            int mid=(left+right)/2;
            if (canAllocate(books,mid,students)){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

    private static boolean canAllocate(int[] books, int pages, int students) {
        int stdCount=1;
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            if (sum+books[i]<=pages){
                sum+=books[i];
            }else {
                stdCount++;
                sum=books[i];
            }
        }
        return stdCount<=students;
    }

    public static void main(String[] args) {
        int[] books={25,46,28,49,24};
        int students=4;
        System.out.println(allocateBooks(books,students));
    }

}
