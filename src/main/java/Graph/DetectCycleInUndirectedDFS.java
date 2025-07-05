package Graph;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInUndirectedDFS {

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
        System.out.println(detectCycles(list,nodes));
    }

    private static boolean detectCycles(List<List<Integer>> list, int nodes) {
        boolean[] vis=new boolean[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            if (!vis[i]){
                if (detectCycleDFS(list,vis,0,i,i)) return true;
            }
        }
        return false;
    }

    private static boolean detectCycleDFS(List<List<Integer>> list, boolean[] vis, int previousNode, int startingNode, int currentNode) {

        vis[currentNode]=true;
        for (Integer it:list.get(currentNode)){
            if (!vis[it]){
                if (detectCycleDFS(list,vis,currentNode,startingNode,it))
                    return true;
            } else if (previousNode!= it) {
                return true;
            }
        }
        return false;
    }
}
