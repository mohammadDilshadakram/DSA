import java.util.*;
public class floodfill {
    public static void helper(int[][] image, int sr, int sc, int color,int row, int col,int orgColor){
        if(sr>=row || sc>=col || sr<0 || sc<0 || image[sr][sc]==color || image[sr][sc]!=orgColor){
            return;
        }
        image[sr][sc]=color;
        helper(image,sr-1,sc,color,row,col,orgColor);
        helper(image,sr+1,sc,color,row,col,orgColor);
        helper(image,sr,sc-1,color,row,col,orgColor);
        helper(image,sr,sc+1,color,row,col,orgColor);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int image[][]={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int scol=1;
        int color=2;
        int row=image.length;
        int col=image[0].length;
        int orgColor=image[sr][scol];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
        helper(image,sr,scol,color,row,col,orgColor);
        System.out.println("-----------X--After flood fill--X-----------");
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
