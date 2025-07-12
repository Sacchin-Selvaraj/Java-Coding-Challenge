package Graph;

import java.util.ArrayList;
import java.util.List;

class DisJoint{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    public DisJoint(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findultPar(int node){
        if (node==parent.get(node)){
            return node;
        }
        int ulp=findultPar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionByRank(int u, int v){
        int ulp_u=findultPar(u);
        int ulp_v=findultPar(v);
        if (ulp_u==ulp_v) return;
        if (rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }else if (rank.get(ulp_u)>rank.get(ulp_v)){
            parent.set(ulp_v,ulp_u);
        }else {
            parent.set(ulp_v,ulp_u);
            int rank_u=rank.get(ulp_u);
            rank.set(ulp_u,rank_u+1);
        }
    }
    public void unionBySize(int u, int v){
        int ulp_u=findultPar(u);
        int ulp_v=findultPar(v);
        if (ulp_u==ulp_v) return;
        if (size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
        }else {
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
        }
    }
}
public class DisJointByRank {

    public static void main(String[] args) {
        DisJoint disJoint=new DisJoint(7);
        disJoint.unionBySize(1,2);
        disJoint.unionBySize(2,3);
        disJoint.unionBySize(4,5);
        disJoint.unionBySize(6,7);
        disJoint.unionBySize(5,6);
        if (disJoint.findultPar(3)==disJoint.findultPar(5)){
            System.out.println("Same Connected Components");
        }else {
            System.out.println("Different Connected Components");
        }
        disJoint.unionBySize(3,7);
        if (disJoint.findultPar(3)==disJoint.findultPar(5)){
            System.out.println("Same Connected Components");
        }else {
            System.out.println("Different Connected Components");
        }
    }
}
