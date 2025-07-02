package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        int nodes=8;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for (int i = 0; i <= nodes; i++) {
            list.add(new ArrayList<>());
        }
        list.get(1).add(2);
        list.get(1).add(6);
        list.get(2).add(3);
        list.get(2).add(4);
        list.get(6).add(7);
        list.get(6).add(8);
        list.get(4).add(5);
        list.get(7).add(5);

        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(bfs(list,nodes));
    }

    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> list, int nodes) {
        boolean vis[]=new boolean[nodes+1];
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(1);
        vis[1]=true;
        ArrayList<Integer> res=new ArrayList<>();
        while (!bfs.isEmpty()){
            Integer node=bfs.poll();
            res.add(node);
            for (Integer num:list.get(node)){
                if (!vis[num]){
                    bfs.add(num);
                    vis[num]=true;
                }
            }
        }
        return res;
    }
}
