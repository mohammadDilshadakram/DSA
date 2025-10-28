import java.util.*;
public class longest_prefix_suffix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcabc";
        int freq[]=new int[s.length()];
        int pre=0;
        int suff=1;
        while (suff<s.length()) {
            if (s.charAt(pre)==s.charAt(suff)) {
                freq[suff]=pre+1;
                pre++;
                suff++;
            } else {
                if (pre==0) {
                    freq[suff]=0;
                    suff++;
                }else{
                    pre=freq[pre-1];
                }
               
                
            }
        }
        System.out.println(freq[s.length()-1]);
    }
}
