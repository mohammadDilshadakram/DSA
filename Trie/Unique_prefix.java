import java.util.*;
public class Unique_prefix {
    public static class Node {
        Node children[] = new Node[26];
        boolean eow;
        int freq;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            eow = false;
            freq=0;
        }

    }

    static Node root = new Node();
    public static void insert(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
                System.out.print(word.charAt(i));
            }
                
            
            
            curr=curr.children[idx];
            curr.freq++;
        }
        curr.eow=true;
    }

    public static String search(String s) {
        Node curr = root;
        String st="";
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            curr = curr.children[idx];
            st+=s.charAt(i);
            if (curr.freq ==1) {
                break;
            }
            
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        root=new Node();
        String words[]={"the","they","is","dilshad"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            System.out.println();
        }
        String ans[]=new String[words.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=search(words[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
