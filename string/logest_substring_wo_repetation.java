import java.util.*;

public class logest_substring_wo_repetation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="pwwkewxpw";
        int freq[]=new int[256];
        int lp=0;
        int rp=0;
        int maxLength=0;
       while (rp<s.length()) {
        while (freq[s.charAt(rp)]>0) {
            
            freq[s.charAt(lp)]--;
            lp++;
        }
        maxLength=Math.max(maxLength, rp-lp+1);
        freq[s.charAt(rp)]++;
        rp++;
       }
        System.err.println(maxLength);
    }    
}
