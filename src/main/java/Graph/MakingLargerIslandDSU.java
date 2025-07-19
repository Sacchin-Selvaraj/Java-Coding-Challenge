package Graph;

import java.util.*;

class IslandDSU{

    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();

    public IslandDSU(int n) {
        for (int i = 0; i <=n; i++) {
            parent.add(i);
            size.add(1);
        }
    }

    public int findParent(int node){
        if (parent.get(node)==node)
            return node;
        int nextNode=findParent(parent.get(node));
        parent.set(node,nextNode);
        return nextNode;
    }

    public void unionBySize(int u,int v){
        int ulp_u=findParent(u);
        int ulp_v=findParent(v);
        if (ulp_u==ulp_v) return;
        if (size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }else {
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }
}
public class MakingLargerIslandDSU {

    public static void main(String[] args) {

        int[][] island={
                {1,1,0},
                {0,1,0},
                {0,0,0}
        };
        int n=island.length;
        int m=island[0].length;

        IslandDSU dsu=new IslandDSU(n*m-1);
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};

        // making the island with same parent
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (island[i][j]==0){
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    int nx=i+row[k];
                    int ny=j+col[k];
                    if (isvalidIsland(nx,ny,island)){
                        int nodeNum=i*m+j;
                        int adjNodeNum=nx*m+ny;
                        if (dsu.findParent(nodeNum)!=dsu.findParent(adjNodeNum)){
                            dsu.unionBySize(nodeNum,adjNodeNum);
                        }
                    }
                }
            }
        }

        // changing the 1 cell to make larger island
        int maxIslandArea=-1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int islandArea=0;
                if (island[i][j]==1){
                    continue;
                }
                Set<Integer> set=new HashSet<>();
                for (int k = 0; k < 4; k++) {
                    int nx=i+row[k];
                    int ny=j+col[k];
                    if (isvalidIsland(nx,ny,island)){
                        int adjNodeNum=nx*m+ny;
                        set.add(dsu.findParent(adjNodeNum));
                    }
                }
                for (Integer parentNode:set){
                    int area=dsu.size.get(parentNode);
                    islandArea+=area;
                }
                islandArea++; // The cell itself is an Island
                maxIslandArea=Math.max(maxIslandArea,islandArea);
            }
        }
        System.out.println(maxIslandArea);

    }

    private static boolean isvalidIsland(int nx, int ny,int[][] island) {
        if (nx>=0 && nx<island.length && ny>=0 && ny<island[0].length && island[nx][ny]==1){
            return true;
        }
        return false;
    }
}
