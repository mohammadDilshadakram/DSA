import java.util.*;
public class lca {
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
    public static boolean isFound(Node root, Node n){
        if (root==null) {
            return false;
        }
        if (root==n) {
            return true;
        }
        return isFound(root.left, n) || isFound(root.right, n);

    }
    public static Node lca1(Node root,Node n1,Node n2){
        
         if (root == n1 || root == n2) {
            return root;
        }
        if (n1==n2) {
            return n1;
        }
        boolean leftP=isFound(root.left,n1);
        boolean rightQ=isFound(root.right,n2);
        if ((rightQ && leftP) || (!rightQ && !leftP)) {
            return root;
        }
        if (!leftP && rightQ) {
           return lca1(root.right, n1, n2);
        }
        if (!rightQ && leftP) {
            return lca1(root.left, n1, n2);
        }
        return null;
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
        
         Node ans = lca1(root, c, d);
        System.out.println("LCA of " + c.data + " and " + d.data + " is: " + ans.data);
   
    }
}
