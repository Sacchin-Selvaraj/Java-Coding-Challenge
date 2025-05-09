package Recursion;

public class MColouring {
    public static void main(String[] args) {
        int N=4;
        int M=3;
        int E=5;
        int [] colour=new int[M+1];
        if (findMcolours(0,N,M,E,colour)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
    private static boolean findMcolours(int idx,int n, int m, int e, int[] colour) {
        if (idx==n){
            return true;
        }
        for (int i = 0; i < m; i++) {
            if (isValidColour(colour,m,idx,i)){
                colour[idx]=i;
                if (findMcolours(idx+1,n,m,e,colour)){
                    return true;
                }else {
                    colour[idx]=0;
                }
            }
        }
        return false;
    }
    private static boolean isValidColour(int[] colour, int m, int idx, int i) {

        if (idx==0)return true;

        if (idx==1 && colour[idx]==colour[idx-1]) return false;
        if (idx==2 && colour[idx]==colour[idx-1]) return false;
        if (idx==3 && (colour[idx]==colour[idx-1] || colour[idx]==colour[0])) return false;

        return true;

    }
}
