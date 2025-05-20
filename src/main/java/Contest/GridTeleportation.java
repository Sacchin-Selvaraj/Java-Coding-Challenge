package Contest;

public class GridTeleportation {

    public static int minMoves(String[] matrix) {

        int res=findGridWay(matrix,0,matrix.length);
        return res;
    }

    private static int findGridWay(String[] matrix, int idx, int length) {
       return 0;
    }

    public static void main(String[] args) {
        String [] matrix={".#...",".#.#.",".#.#.","...#."};
        System.out.println(minMoves(matrix));
    }
}
