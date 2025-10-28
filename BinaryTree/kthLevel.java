import java.util.*;
public class kthLevel {

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

    public static void klevel(Node root,int n,int i){
        if (root==null) {
            return;
        }
        if (i==n) {
            System.out.println(root.data);
            return;
        }
        klevel(root.left, n, i+1);
        klevel(root.right, n, i+1);


    }

    public static void main(String[] args) {
         Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        klevel(root,3,1);
    }
}
