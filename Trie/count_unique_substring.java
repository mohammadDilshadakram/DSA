import java.util.*;
public class count_unique_substring {
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
                System.out.print(word.charAt(i));
            }
            
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public static void suffixInsertion(String s){
        for (int i = 0; i < s.length(); i++) {
            String suffix=s.substring(i);
            insert(suffix);
        }
    }

    public static int uniqueCount(Node root){
        if (root==null) {
            return 0;
        }
        Node curr=root;
        int count=0;
        for (int i = 0; i < 26; i++) {
            if (curr.children[i]!=null) {
                count+=uniqueCount(curr.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        suffixInsertion("ababa");
        System.out.println(uniqueCount(root));
    }
}
