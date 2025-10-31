import java.util.*;

import org.w3c.dom.Node;
public class lca2 {
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
    public static Node lca2(Node root,Node n1,Node n2){
        if (root==null) {
            return root;
        }
        if (root==n1 || root==n2) {
            return root;
        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right, n1, n2);
        if (leftLca!=null && rightLca!=null) {
            return root;
        }
        if (leftLca==null) {
            return lca2(root.right, n1, n2);
        }else{
           return lca2(root.left, n1, n2);
        }
       
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
        
              Node ans = lca2(root, c, d);
        System.out.println("LCA of " + c.data + " and " + d.data + " is: " + ans.data);
    }    
}
