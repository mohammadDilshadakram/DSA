import java.util.*;
public class longest_common_subsequence {

    public static int lcs(String x,String y, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if (x.charAt(n-1)==y.charAt(m-1)) {
            return 1+lcs(x, y, n-1, m-1);
        } else {
            return Math.max(lcs(x, y, n, m-1), lcs(x, y, n-1, m));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x="abcdef";
        String y="xbcdf";
        System.out.println(lcs(x,y,x.length(),y.length()));
    }
}