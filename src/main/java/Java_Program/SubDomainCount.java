package Java_Program;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.List;

public class SubDomainCount {

    public  static List<String> subdomainVisits(String[] cpdomains) {

        String temp = null;
            for (String word:cpdomains){
               temp=word;
            }
        System.out.println(temp);
      
        

        return null;

    }

    public static void main(String[] args) {

        String[] cpdomains={"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(cpdomains));

    }
}
