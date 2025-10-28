import java.util.*;
public class palindrome{

    public static boolean checko(char ch){
        if (ch>='a'|| ch<='z' && ch>='1' || ch<='9') {
            return true;
        }
        return false;
    }



    public static boolean validPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end) {
            if (!checko(str.charAt(start))) {
                start++;  
                continue; 
            }

              if (!checko(str.charAt(end))) {
                end--;  
            }

            if(Character.toLowerCase(str.charAt(start++))!=Character.toLowerCase(str.charAt(end--))){
                return false;
            }
            continue; 
        }
        return true;

    }

    public static void main(String[] args){
    
        String str="***()&^";
        System.err.println(validPalindrome(str));

    }
}
