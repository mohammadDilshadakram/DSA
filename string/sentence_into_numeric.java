import java.util.*;
public class sentence_into_numeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hello world";
        String ans="";
        String keypad[]={"2","22","222",
                         "3","33","333",
                         "4","44","444",
                         "5","55","555",
                         "6","66","666",
                         "7","77","777","7777",
                         "8","88","888",
                         "9","99","999","9999"};
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ans+="0";
            }else{
                int position=s.charAt(i)-'a';
            ans+=keypad[position];
            }
            

        }
        System.out.println(ans);

    }
}
