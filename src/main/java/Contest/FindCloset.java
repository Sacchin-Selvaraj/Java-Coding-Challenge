package Contest;

public class FindCloset {

    public static int findClosest(int x, int y, int z) {
        int xz=Math.abs(x-z);
        int yz=Math.abs(y-z);
        if (xz==yz)
            return 0;
        return xz<yz?1:2;
    }

    public static void main(String[] args) {
        int x=1,y=5,z=3;
        System.out.println(findClosest(x,y,z));
    }
}
