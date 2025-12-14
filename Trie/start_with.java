import java.util.*;
import java.util.Scanner;
public class start_with {

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

    public static boolean startWith(String key){
        Node curr=root;
        for (int i = 0; i < key.length(); i++) {
            int idx=key.charAt(i)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words[]={"i","like","samsung","sung"};
        root=new Node();
        for (int i = 0; i < words.length; i++) {
            
            insert(words[i]);
            System.out.println();
        }
        System.out.println(startWith("samsung"));

    }
}
