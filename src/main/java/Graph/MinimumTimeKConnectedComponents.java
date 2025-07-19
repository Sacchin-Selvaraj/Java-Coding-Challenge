package Graph;

class MinimumTimeDSU{
    int[] parent;
    int[] size;

    public MinimumTimeDSU(int n) {
        parent=new int[n+1];
        size=new int[n+1];
        for (int i = 0; i < n; i++) {
            parent[i]=i;
            size[i]=1;
        }
    }
    public int findParent(int node){
        if (node==parent[node]){
            return node;
        }
        parent[node]=findParent(parent[node]);
        return parent[node];
    }
    public boolean unionBySize(int u,int v){
        int ulp_u=findParent(u);
        int ulp_v=findParent(v);
        if (ulp_u==ulp_v) return false;
        if (size[ulp_u]<size[ulp_v]){
            parent[ulp_u]=ulp_v;
            size[ulp_v]+=size[ulp_u];
        }else {
            parent[ulp_v]=ulp_u;
            size[ulp_u]+=size[ulp_v];
        }
        return true;
    }
}
public class MinimumTimeKConnectedComponents {

    public static int minTime(int n, int[][] edges, int k) {
        int res=0;
        int left=0;
        int maxTime=-1;
        for (int[] edge : edges){
            if (edge[2]>maxTime){
                maxTime=edge[2];
            }
        }
        int right=maxTime;

        while (left<=right){
            MinimumTimeDSU timeDSU=new MinimumTimeDSU(n);
            int mid=(left+right)/2;
            int components=n;
            for (int[] edge:edges){
                if (edge[2]<=mid){
                    continue;
                }
                if (timeDSU.unionBySize(edge[0],edge[1])){
                    components--;
                }
            }
            if (components>=k){
                res=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] edges={
                {0,1,2},
                {1,2,4}
        };
        int k=3;
        System.out.println(minTime(n,edges,k));
    }
}
