import java.util.*;
public class reverse_word_in_string {
    public static String reverse(String word){
        StringBuilder sb=new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Hello World  this is a  beautifull world   ");
        sb.reverse();
        sb.toString();
        String ans="";
        for(int i=0;i<sb.length();i++){
            String word="";
            while (i<sb.length() && sb.charAt(i)!=' ') {
                word+=sb.charAt(i);
                i++;
            }
            if (word.length()>0) {
                ans+=(" "+reverse(word));
            }
        }
        System.out.println(ans.trim());
    }
}