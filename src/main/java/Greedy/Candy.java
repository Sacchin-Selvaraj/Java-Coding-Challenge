package Greedy;

public class Candy {

    private static int minimumCandy(int[] childRating) {
        // Not working as Expected
        int resSum=0;
        int up=1,down=1;
        childRating[0]=0;
        int peak=0,bottom=0;
        for (int i = 0; i < childRating.length-1; i++) {
            if (childRating[i]<childRating[i+1]){
                resSum+=up++;
                if (down>up){
                    resSum+=(down-up);
                }
                peak=up;
                down=1;
            } else if (childRating[i]>childRating[i+1]) {
                resSum+=down++;
                bottom=down;
                up=1;
            }else {
                if (bottom>peak){
                    resSum+=(bottom-peak);
                }
                resSum+=1;
                down=1;
                up=1;
            }

        }
        return resSum;

    }
    public static void main(String[] args) {
        //int[] childRating={0,2,4,7,6,5,4,3,2,1,1,1,2,3,4,2,1,1,1};
        int[] childRating={1,0,2};
        //System.out.println(minimumCandy(childRating));
        System.out.println(candy(childRating));
    }
    public static int candy(int[] ratings) {
        //Optimal Solution
        int sum=0,i=1,peak=1,bottom=1;
        int n= ratings.length;
        if (n==1)
            return 1;
        while (i < n){
            if (ratings[i]==ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            peak=1;
            while (i<n && ratings[i]>ratings[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            bottom=1;
            while (i<n && ratings[i]<ratings[i-1]){
                sum+=bottom;
                i++;
                bottom+=1;
            }
            if (bottom>peak){
                sum+=(bottom-peak);
            }
        }
        return sum;
    }

}
