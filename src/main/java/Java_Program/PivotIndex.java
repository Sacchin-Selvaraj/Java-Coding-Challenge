package Java_Program;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        pref[0]=nums[0];
        suff[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
            suff[n-1-i]=suff[n-i]+nums[n-1-i];
        }

        for(int i=0;i<n;i++){
            if(i==0){
                if(suff[i+1]==0)
                    return i;
            }else if(i==n-1){
                if(pref[i-1]==0)
                    return i;
            }
            else if(pref[i-1]==suff[i+1]){
                return i;
            }
        }

        return -1;
    }
}
