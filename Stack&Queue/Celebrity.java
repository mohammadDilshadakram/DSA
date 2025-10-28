import java.util.*;
public class Celebrity {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
     int arr[][]={
        {0,0,1,0},
        {0,0,1,0},
        {0,0,0,0},
        {0,0,1,0}
     };
     int n=arr[0].length;
     Stack<Integer> s=new Stack<>();
     for(int i=0;i<n;i++){
        s.push(i);
     }  
     while (s.size()>1) {
        int a =s.pop();
        int b=s.pop();
        if(arr[a][b]==0){
            s.push(a);
        }else{
            s.push(b);
        }
     }
     int Celebrity=s.pop();
     boolean isCelebrity = true;
     for (int j = 0; j < arr.length; j++) {
        if (arr[j][Celebrity]==0 || arr[Celebrity][j]==1) {
            isCelebrity=false;
            break;
        }
     }

        if (isCelebrity) {
            System.out.println(Celebrity);
        } else {
            System.out.println("none"); 
        }
    }
}
