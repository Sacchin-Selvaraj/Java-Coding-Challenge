package Contest;

public class MaximumContainer {

    public static int maxContainers(int n, int w, int maxWeight) {

        int maxContainer=n*n;
        int weight=maxContainer*w;
        if (weight<maxWeight)
            return maxContainer;
        if (weight>maxWeight){
            maxContainer=maxWeight/w;
        }
        return maxContainer;

    }

    public static void main(String[] args) {
        int n=3;
        int w=5;
        int maxWeight=20;
        System.out.println(maxContainers(n,w,maxWeight));
    }
}
