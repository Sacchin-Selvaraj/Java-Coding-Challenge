package Graph;

import java.util.Arrays;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int num=image[sr][sc];
        dfsFloodFill(image,sr,sc,color,num);
        return image;
    }

    private static void dfsFloodFill(int[][] image, int sr, int sc, int color,int initColor) {
        int n=image.length;
        int m=image[0].length;
        if (sr<0 || sr>=n || sc<0 || sc>=m || image[sr][sc]!=initColor || image[sr][sc]==color){
            return;
        }
        image[sr][sc]=color;
        dfsFloodFill(image,sr-1,sc,color,initColor);
        dfsFloodFill(image,sr+1,sc,color,initColor);
        dfsFloodFill(image,sr,sc-1,color,initColor);
        dfsFloodFill(image,sr,sc+1,color,initColor);
    }

    public static void main(String[] args) {
        int[][] image={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        int sr=1;
        int sc=1;
        int color=0;
        System.out.println(Arrays.deepToString(floodFill(image,sr,sc,color)));
    }
}
