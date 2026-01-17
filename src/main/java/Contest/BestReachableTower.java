package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BestReachableTower {

    public static int[] bestTower(int[][] towers, int[] center, int radius) {
        Map<Integer,int[]> tower = new TreeMap<>((o1, o2) -> o2-o1);
        for (int[] t:towers){
            int x = Math.abs(t[0]-center[0]);
            int y = Math.abs(t[1]-center[1]);

            int sum = x+y;

            if (sum<=radius){
                int q = t[2];
                if (tower.containsKey(q)){
                    int[] k = tower.get(q);
                    if (k[0]<t[0]){
                        tower.put(q,new int[]{k[0],k[1]});
                    } else if (k[0]==t[0] && k[1]<t[1]) {
                        tower.put(q,new int[]{k[0],k[1]});
                    }else {
                        tower.put(q,new int[]{t[0],t[1]});
                    }
                }else {
                    tower.put(q,new int[]{t[0],t[1]});
                }
            }
        }

        if (tower.isEmpty()){
            return new int[]{-1,-1};
        }

        System.out.println(tower);

        return tower.values().stream().findFirst().get();
    }

    public static void main(String[] args) {
        int[][] towers={{1,3,4},{2,2,4},{4,4,7}};
        int[] center={0,0};
        int radius=5;

        System.out.println(Arrays.toString(bestTower(towers,center,radius)));
    }
}
