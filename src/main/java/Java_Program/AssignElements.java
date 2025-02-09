package Java_Program;

import java.util.Arrays;

public class AssignElements {

    public static int[] assignElements(int[] groups, int[] elements) {

        int[]res=new int[groups.length];
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                if(groups[i]%elements[j]==0){
                    res[i]=j;
                    break;
                }else
                    res[i]=-1;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] groups={8,4,3,2,4};
        int[] elements={4,2};

        System.out.println(Arrays.toString(assignElements(groups,elements)));
    }
}
