import java.util.*;
public class maxDiameter {
     public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Pair{
        int diam;
        int ht;
        Pair(int h,int d){
             this.diam=d;
             this.ht=h;
        }
       
    }
    public static Pair maxD(Node root){
        if (root==null) {
            return new Pair(0,0);
        }
        Pair leftPair=maxD(root.left);
        Pair rightPair=maxD(root.right);
        int diam=Math.max(leftPair.ht + rightPair.ht +1, Math.max(leftPair.diam, rightPair.diam));
        int ht=Math.max(leftPair.ht, rightPair.ht)+1;
        return new Pair(ht, diam);

        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        b.left = c;
        b.right = d;
        Pair wer=maxD(root);
        System.out.println(wer.diam);
        
    }
}
