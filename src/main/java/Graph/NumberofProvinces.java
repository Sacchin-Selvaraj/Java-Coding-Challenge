package Graph;

import java.util.ArrayList;


public class NumberofProvinces {

    public static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjLs=new ArrayList<>();
        int provinces=0;
        int n=isConnected.length;
        for (int i = 0; i < n; i++) {
            adjLs.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j]==1 & i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        boolean[] vis =new boolean[n];
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]){
                provinces++;
                dfsProvinces(vis,adjLs,i);
            }
        }
        return provinces;
    }

    private static void dfsProvinces(boolean[] vis, ArrayList<ArrayList<Integer>> adjLs, int node) {
        vis[node]=true;
        for (Integer it:adjLs.get(node)){
            if (!vis[it]){
                dfsProvinces(vis,adjLs,it);
            }
        }
    }

    public static void main(String[] args) {
        int[][] connected={
                {1,1,0},
                {0,1,0},
                {0,0,1}
        };
        System.out.println(findCircleNum(connected));
        System.out.println(findCircleNumMatrix(connected));
    }

    private static int findCircleNumMatrix(int[][] connected) {
        int provinces=0;
        boolean[] visited=new boolean[connected.length];
        for (int i = 0; i < connected.length; i++) {
            if (!visited[i]){
                provinces++;
                dfsMatrix(connected,visited,i);
            }
        }
        return provinces;
    }

    private static void dfsMatrix(int[][] connected, boolean[] visited, int node) {
        visited[node]=true;
        for (int i = 0; i < connected.length; i++) {
            if (connected[node][i]==1 & !visited[i]){
                dfsMatrix(connected,visited,i);
            }
        }
    }
}
