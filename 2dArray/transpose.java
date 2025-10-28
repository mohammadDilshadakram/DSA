import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, j, n, m, count = 0;
        System.out.println("Enter the row");
        n = sc.nextInt();
        System.out.println("Enter the column");
        m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.println("Enter the value in matrix");
                matrix[i][j] = sc.nextInt();  
            }
           
        }
        for(int y=0;y<m;y++){
            for(int z=0;z<n;z++){
                System.out.print(matrix[z][y]);
            }
            System.out.println();
        }

sc.close();
    }
}
