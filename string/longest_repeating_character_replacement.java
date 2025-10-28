import java.util.*;
public class longest_repeating_character_replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="aababcc";
        int k=2;
        int required_step;
        int freq[]=new int[26];
        int winSize;
        int left=0;
        int maxfreq=0;
        int maxwin=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            maxfreq=Math.max(maxfreq, freq[ch-'a']);
            winSize=i-left+1;
            if(winSize-maxfreq>k){
                freq[s.charAt(left)-'a']--;
                left++;
            }

            winSize=i-left+1;
            maxwin=Math.max(maxwin, winSize);
        }
        System.out.println(maxwin);
    }
}
