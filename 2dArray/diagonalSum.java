import java.util.*;
public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        for(i=0;i<matrix.length;i++){
            
                sum+=matrix[i][i];
                if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-i-1];

            
        }
System.out.println(sum);

    }
}
