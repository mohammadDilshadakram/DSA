import java.util.*;
public class printDuplicate {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']>1){
                System.out.println("The character "+  ch+" has frequency"+freq[ch-'a']);
                freq[ch-'a']=0;
                
            }
        }
    }
}
