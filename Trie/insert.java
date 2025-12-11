import java.util.*;
public class insert {

    static class Node{
        Node children[]=new Node[26];
        boolean eow;
        Node(){
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            eow=false;
        }
    }

    public static void insert(String word){
        Node curr=new Node();
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
    public static void main(String[] args) {
        String words[]={"the","they","is","dilshad"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
            System.out.println();
        }
    }
}
