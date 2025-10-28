import java.util.*;
public class palindromic_substrings {

    public static int helper(String s, int left,int right){
        int count=0;
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="aaa";
        int count=0;
        for(int i=0;i<s.length();i++){
            int oddPallin=helper(s,i,i);
            int evenPallin=helper(s,i,i+1);
            count+=oddPallin+evenPallin;
        } 
        System.out.println(count);
    }
}