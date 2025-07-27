package Contest;

import java.util.*;

public class FindMinimumJumpstoReachEnd {

    public static int minJumps(int[] nums) {
        int n = nums.length;
        if(n<=1) return 0;
        int max = 0;
        for(int i:nums)
            max = Math.max(max,i);
        //find the primes array : for nums[i] arr[nums[i]] = smallest
        //prime that divide nums[i]
        int[] arr = fillSmallestPrime(max);

        HashMap<Integer,List<Integer>> map =new HashMap<>();
        //buid graph
        buildGraph(map,n,nums,arr);
        //to keep track of minimum distance
        int[] dist = new int[n];
        Arrays.fill(dist,-1);
        Queue<Integer> q = new LinkedList<>();
        dist[0] = 0;
        q.offer(0);
        //do a level order traversal
        while(!q.isEmpty()){
            int curr= q.poll();
            int d = dist[curr];
            //stop if we reach the end
            if(curr == n-1) return d;
            //go left
            if(curr-1>=0 && dist[curr-1]<0){
                dist[curr-1]=d+1;
                q.offer(curr-1);
            }
            //go right
            if(curr+1<n && dist[curr+1]<0){
                dist[curr+1]=d+1;
                q.offer(curr+1);
            }
            //teleport to any index if it is prime
            int temp = nums[curr];
            //if arr[temp] == temp then it is temp
            if(temp>1 && arr[temp]==temp){
                List<Integer> adj= map.getOrDefault(temp,new ArrayList<Integer>());
                for(int j:adj){
                    if(dist[j]<0){
                        dist[j] = d+1;
                        q.offer(j);
                    }
                }
                map.remove(temp);
            }
        }
        return -1;
    }

    static int[] fillSmallestPrime(int max){
        int[] arr = new int[max+1];
        for(int i = 2;i<=max;i++){
            if(arr[i]==0){
                for(int j = i;j<=max;j+=i){
                    if(arr[j]==0) arr[j] = i;
                }
            }
        }
        return arr;
    }
    static void buildGraph(HashMap<Integer, List<Integer>> map, int n, int[] nums, int[] arr){
        for(int i = 0;i<n;i++){
            int temp = nums[i];
            HashSet<Integer> set = new HashSet<Integer>();
            while(temp>1){
                int k = arr[temp];
                if(!set.contains(k)){
                    map.computeIfAbsent(k,a->new ArrayList<>()).add(i);
                    set.add(k);
                }
                temp /= k;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,7,9};
        System.out.println(minJumps(nums));
    }
}
