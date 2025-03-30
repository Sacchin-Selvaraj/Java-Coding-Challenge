package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Substring {

    public static void main(String[] args) {
        String s="abc";
        List<Character> list=new ArrayList<>();
        findSubstrin(s,0,s.length(),list);
    }

    private static void findSubstrin(String s,int left, int right,List<Character> list) {

        if (left>=right){
            System.out.println(list);
            return;
        }
        list.add(s.charAt(left));
        findSubstrin(s,left+1,right,list);
        Object obj=s.charAt(left);
        list.remove(obj);
        findSubstrin(s,left+1,right,list);
    }
}
