package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class ShortestDistanceBFS {

    private static int[] getShortestpathBfs(int nodes, ArrayList<ArrayList<Integer>> list) {
        int[] distance=new int[nodes];
        Arrays.fill(distance, (int) 1e9);
        distance[0]=0;
        for (int i = 0; i < nodes; i++) {
            if(i==0 || distance[i]==1e9){
                bfsShortest(distance,list,i);
            }
        }
        return distance;
    }

    private static void bfsShortest(int[] distance, ArrayList<ArrayList<Integer>> list, int node) {
        Queue<int[]> queue=new ArrayDeque<>();
        queue.add(new int[]{node,0});
        while (!queue.isEmpty()){
            int[] pair=queue.poll();
            int homeNode=pair[0];
            int wt=pair[1];
            for (Integer nextNode : list.get(homeNode)){
                if (distance[homeNode]+1<distance[nextNode]){
                    distance[nextNode]=distance[homeNode]+1;
                    queue.add(new int[]{nextNode,distance[nextNode]});
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes=9;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        list.get(0).add(3);
        list.get(1).add(0);
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(1);
        list.get(2).add(6);
        list.get(3).add(0);
        list.get(3).add(4);
        list.get(4).add(3);
        list.get(4).add(5);
        list.get(5).add(4);
        list.get(5).add(6);
        list.get(6).add(2);
        list.get(6).add(5);
        list.get(6).add(7);
        list.get(6).add(8);
        list.get(7).add(6);
        list.get(7).add(8);
        list.get(8).add(6);
        list.get(8).add(7);
        System.out.println(Arrays.toString(getShortestpathBfs(nodes,list)));
    }
}
