package Graph;

import java.util.ArrayList;
import java.util.List;

class DisJoint{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();

    public DisJoint(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
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
}
public class DisJointByRank {

    public static void main(String[] args) {
        DisJoint disJoint=new DisJoint(7);
        disJoint.unionByRank(1,2);
        disJoint.unionByRank(2,3);
        disJoint.unionByRank(4,5);
        disJoint.unionByRank(6,7);
        disJoint.unionByRank(5,6);
        if (disJoint.findultPar(3)==disJoint.findultPar(5)){
            System.out.println("Same Connected Components");
        }else {
            System.out.println("Different Connected Components");
        }
        disJoint.unionByRank(3,7);
        if (disJoint.findultPar(3)==disJoint.findultPar(5)){
            System.out.println("Same Connected Components");
        }else {
            System.out.println("Different Connected Components");
        }
    }
}
