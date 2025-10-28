import java.util.*;
public class rowSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        int i,j,sum=0;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {

                // for (int j = 0; j < matrix[1].length; j++) {
                //     sum += matrix[1][j];
                // }



                
                // System.out.println(sum+=matrix[1][j]);
                sum+=matrix[1][j];
            }
            break;
        }
       System.out.println(sum); 
    }
}
