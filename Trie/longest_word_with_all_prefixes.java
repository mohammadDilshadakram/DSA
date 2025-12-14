import java.util.*;
public class longest_word_with_all_prefixes {
    
    public static class Node {
        Node children[] = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
                
            }
            
            curr=curr.children[idx];
        }
        curr.eow=true;
    } 
    public static String s="";
    public static String longestWord(StringBuilder sb,Node curr){
        if (curr==null) {
            return="";
        }
        for (int i = 0; i < 26; i++) {
            if (curr.children[i]!=null && curr.children[i].eow==true) {
                char ch=(char)(i+'a');
                sb.append(ch);

                if (sb.length()>s.length()) {
                    s=sb.toString();
                }
                longestWord(sb,curr.children[i]);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String words[]={"p", "pr", "pro", "probl", "problem", "pros", "process", "processor"};
        root=new Node();
        s="";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        StringBuilder sb=new StringBuilder();
        System.out.println(longestWord(sb, root));
    }
}
