package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DetectCycleinUnDirectedGraphBFS {

    private static boolean detectCycle(List<List<Integer>> list, int nodes) {
        boolean[] vis =new  boolean[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            if (!vis[i]){
                if (detectCycleBFS(list,nodes,vis,i))return true;
            }
        }
        return false;
    }

    private static boolean detectCycleBFS(List<List<Integer>> list, int nodes,boolean[] vis,int src) {
        Queue<int[]> queue=new ArrayDeque<>();
        queue.add(new int[]{src,0});
        while (!queue.isEmpty()){
            int[] pair=queue.poll();
            vis[pair[0]]=true;
            for (Integer node:list.get(pair[0])){
                if (node==pair[1]){
                    continue;
                }
                if (!vis[node]){
                    queue.add(new int[]{node,pair[0]});
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        int nodes=7;
        for (int i = 0; i <= nodes; i++) {
            list.add(new ArrayList<>());
        }
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(1);
        list.get(2).add(5);
        list.get(3).add(1);
        list.get(3).add(4);
        list.get(3).add(6);
        list.get(4).add(3);
        list.get(5).add(2);
        list.get(5).add(7);
        list.get(6).add(3);
        list.get(6).add(7);
        list.get(7).add(5);
        list.get(7).add(6);
        System.out.println(detectCycle(list,nodes));
    }

}
