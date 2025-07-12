package Graph;

import java.util.ArrayList;
import java.util.List;

class ProvincesDSU{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();

    public ProvincesDSU(int n) {
        for (int i = 0; i <=n; i++) {
            parent.add(i);
            size.add(1);
        }
    }
    public int findParent(int u){
        if (parent.get(u)==u){
            return u;
        }
        int node=findParent(parent.get(u));
        parent.set(u,node);
        return parent.get(u);
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

public class NumberOfProvincesDSU {

    public static void main(String[] args) {
        int[][] connected={
                {1,0,1},
                {0,1,0},
                {1,0,1}
        };
        int V=3;
        ProvincesDSU dsu=new ProvincesDSU(V);
        for (int i = 0; i < connected.length; i++) {
            for (int j = 0; j < connected[0].length; j++) {
                if (connected[i][j]==1){
                    dsu.unionBySize(i,j);
                }
            }
        }
        int provinces=0;
        for (int i = 0; i < V; i++) {
            if (dsu.parent.get(i)==i){
                provinces++;
            }
        }
        System.out.println(provinces);
    }
}
