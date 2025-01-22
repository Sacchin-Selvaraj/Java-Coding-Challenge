package Java_Program;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class SubDomainCount {

    public static List<String> subdomainVisits(String[] cpdomains) {

        Queue<String> queue=new ArrayDeque<>();
        String temp = null;
        for (String word : cpdomains) {
            temp = word;
        }
        for (int i = temp.length() - 1; i > 0; i--) {

        }

        System.out.println(temp);


        return null;

    }

    public static void main(String[] args) {

        String[] cpdomains = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(cpdomains));

    }
}
