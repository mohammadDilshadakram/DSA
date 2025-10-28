import java.util.*;

public class keyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                if(matrix[i][j]==7){//key is seven only
                count++;
                }
                
            }
           
        }


        

        System.out.println("total number of trimes n occur is" + count);
    }
}