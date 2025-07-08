package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TopoSortBFS {

    private static ArrayList<Integer> topoSortBFS(ArrayList<ArrayList<Integer>> adjList, int nodes) {
        int[] indegree=new int[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            for (Integer it:adjList.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> queue=new ArrayDeque<>();
        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i]==0){
                queue.add(i);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            int node=queue.poll();
            list.add(node);
            for (Integer it:adjList.get(node)){
                indegree[it]--;
                if (indegree[it]==0){
                    queue.add(it);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int nodes=5;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(3).add(4);
        adjList.get(3).add(5);
        adjList.get(4).add(2);
        System.out.println(topoSortBFS(adjList,nodes));
    }
}
