import java.util.*;

public class logest_palindromic_substring {

    public static String helper(String s,int left,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aaaa";
        int lp = 0;
        int rp = 0;
        String ans = "";
        String finalans = "";
        for (int i = 0; i < s.length(); i++) {

            String oddPal = helper(s, i, i);
            String evenPal = helper(s, i, i + 1);
            String longer;
            if (oddPal.length() > evenPal.length()) {
                longer = oddPal;
            } else {
                longer = evenPal;
            }

            if (longer.length()>finalans.length()) {
                finalans=longer;
            }

        }

        System.out.println(finalans);

    }
}