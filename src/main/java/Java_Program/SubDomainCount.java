package Java_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubDomainCount {

    public static List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String,Integer> map=new HashMap<>();
        for (String word : cpdomains) {
            String[] words = word.split(" ");
            int num = Integer.parseInt(words[0]);

            map.put(words[1], map.getOrDefault(words[1], 0) + num);
            while (words[1].contains(".")) {
                words[1] = words[1].substring(words[1].indexOf(".")+1);
                map.put(words[1], map.getOrDefault(words[1], 0) + num);
            }
        }
            List<String> res=new ArrayList<>();
            for (String word1:map.keySet()){
                res.add(map.get(word1)+" "+word1);
            }
            return res;
    }

    public static void main(String[] args) {

        String[] cpdomains = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(cpdomains));

    }
}
