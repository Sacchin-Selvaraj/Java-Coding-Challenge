package Contest;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class MaximumUniqueSubarray {
    public static int maxSum(int[] nums) {

        if (nums.length==1)
            return nums[0];
        int max=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
           if (nums[i]<=0||list.contains(nums[i])){
               if (nums[i]>min)
                   min=nums[i];
               int temp=list.stream().mapToInt(Integer::intValue).sum();
               if (temp>max)
                   max=temp;
               //list=new ArrayList<>();
           }else {
               list.add(nums[i]);
           }

        }
      if (!list.isEmpty()){
          int temp=list.stream().mapToInt(Integer::intValue).sum();
          if (temp>max)
              max=temp;
      }

      return (max==0)?min:max;
    }

    public static void main(String[] args) {
        int[] nums={2,-10,6};
        System.out.println(maxSum(nums));
    }
}
