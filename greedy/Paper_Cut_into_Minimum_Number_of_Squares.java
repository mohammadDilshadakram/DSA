import java.util.*;
public class Paper_Cut_into_Minimum_Number_of_Squares {

    public static int count(int a,int b){
        if (a==0 || b==0) {
            return 0;
        }
        if (a==b) {
            return 1;
        }
        if (a>b) {
            return 1+count(a-b, b);
        }
        else {
            return 1+count(a, b-a);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=13,b=11;
        
        
        System.out.println(count(a, b));
    }
}
