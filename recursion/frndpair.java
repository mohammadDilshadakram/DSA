import java.util.*;
public class frndpair {
    public static int fp(int n){
        if(n==1 || n==2){
            return n;
        }
        int fm=fp(n-1);
        int fm1=fp(n-2);
        return fm*((n-1)*fm1);
    }
    public static void main(String[] args) {
        int ans=fp(89);
        System.out.println(ans);
    }
}
