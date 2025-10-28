import java.util.*;
public class egyptian_pyramid {

    public static void egyptianFraction(int num,int den){
        if (num==0 || den==0) {
            return;
        }
        //2/8
        if (den%num==0) {
            System.out.print("1/"+den/num);
            return;
        }
        if (num%den==0) {
            System.out.println(num/den);
             return;
        }
        if (num>den) {
           System.out.print(num/den +"+");
           egyptianFraction(num%den, den);
            return;
        }
        if (den>num) {
            int n=(int)Math.ceil((double)den/num);
            System.out.print("1/"+n+"+");
            egyptianFraction(num*n-den, n*den);
             return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=6,den=14;
        egyptianFraction(num,den);
    }
}
