import java.util.*;

import org.w3c.dom.Node;
public class invertTree {
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
    public static Node invert(Node root){
        if (root==null) {
            return root;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        invert(root.left);
        invert(root.right);
        return root;
    }
    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
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
            //  1
            // / \
            // 2   3
            //     / \
            //     4   5
       System.out.println("Preorder before inversion:");
        preorder(root);

        invert(root);

        System.out.println("\nPreorder after inversion:");
        preorder(root);
    }
}
