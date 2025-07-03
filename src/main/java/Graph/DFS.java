package Graph;

import java.util.ArrayList;


public class DFS {

    public static void main(String[] args) {
        int nodes=9;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i = 1; i <= nodes; i++) {
            list.add(new ArrayList<>());
        }
        list.get(1).add(2);
        list.get(1).add(3);
        list.get(2).add(1);
        list.get(2).add(5);
        list.get(2).add(6);
        list.get(3).add(1);
        list.get(3).add(4);
        list.get(3).add(7);
        list.get(6).add(2);
        list.get(5).add(2);
        list.get(4).add(3);
        list.get(4).add(8);
        list.get(7).add(3);
        list.get(7).add(8);
        list.get(8).add(4);
        list.get(8).add(7);

        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println(dfs(list,nodes));
    }

    private static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> list, int nodes) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[nodes+1];
        dfsSearch(list,1,vis,res);
        return res;
    }

    private static void dfsSearch(ArrayList<ArrayList<Integer>> list, int node, boolean[] vis, ArrayList<Integer> res) {
        vis[node]=true;
        res.add(node);
        for (Integer it:list.get(node)){
            if (!vis[it]){
                dfsSearch(list,it,vis,res);
            }
        }
    }
}
