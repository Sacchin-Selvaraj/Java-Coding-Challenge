package Greedy;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfPlatforms {

    public static int findPlatform(int[] arrival, int[] departure) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(departure[0]);
        list.add(list1);
        for (int i = 1; i < arrival.length; i++) {
            boolean flag=false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getLast()>arrival[i]){
                    flag=true;
                }else {
                    list.get(j).add(departure[i]);
                    flag=false;
                    break;
                }
            }
            if (flag){
                list.add(new ArrayList<>());
                list.getLast().add(departure[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] arrival={900, 940, 950, 1100, 1500, 1800};
        int[] departure={910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arrival,departure));
        System.out.println(findPlatformOptimal(arrival,departure));
    }

    private static int findPlatformOptimal(int[] arrival, int[] departure) {
        return 0;
    }

}
