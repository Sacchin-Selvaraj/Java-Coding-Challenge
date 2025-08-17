package Graph;

import java.util.ArrayList;
import java.util.List;

class AdjacentyList{
    int first;
    int weight;
    boolean flag;

    public AdjacentyList(int first, int weight, boolean flag) {
        this.first = first;
        this.weight = weight;
        this.flag = flag;
    }
}
public class MinimumCostPathWithEdgeReversals {

    static int minimumCost=Integer.MAX_VALUE;

    public static int minCost(int n, int[][] edges) {
        List<List<AdjacentyList>> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int node=edge[0];
            int nextNode=edge[1];
            int weight=edge[2];
            list.get(node).add(new AdjacentyList(nextNode,weight,false));
            list.get(nextNode).add(new AdjacentyList(node,weight*2,false));
        }
        boolean[] vis=new boolean[n];
       minCostDfs(list,0,0,vis);
       return minimumCost;
    }

    private static int minCostDfs(List<List<AdjacentyList>> list, int node, int minCost, boolean[] vis) {
        if (node==vis.length-1){
            storeMinCost(minCost);
            return minCost;
        }
        vis[node]=true;
        for (AdjacentyList adjacentyLists : list.get(node)){
            int nextNode=adjacentyLists.first;
            int weight=adjacentyLists.weight;
            if (!vis[nextNode]) {
                minCost+=weight;
                minCost = minCostDfs(list, nextNode, minCost, vis);
                minCost-=weight;
                vis[nextNode]=false;
            }
        }
        return minCost;
    }

    private static int storeMinCost(int minCost) {
        minimumCost=Math.min(minCost,minimumCost);
        return minimumCost;
    }

    public static void main(String[] args) {
        int n=2;
        int[][] edges={
                {0,1,24},
                {1,0,21}
//                {2,3,4},
//                {0,2,2}
        };
        System.out.println(minCost(n,edges));
    }
}
