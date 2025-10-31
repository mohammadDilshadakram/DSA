import java.util.*;
public class symmetryTree {
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
    public static boolean isSame(Node p, Node q){
        if (p==null && q==null) {
            return true;
        }
        if (p==null || q==null) {
            return false;
        }
       if (p.data != q.data) {
    return false;
}
        return isSame(p.left, q.left) && isSame(p.right, q.right);
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
    public static boolean symmetry(Node root){
        if (root==null) {
            return false;
        }
        root.left=invert(root.left);
        return isSame(root.left,root.right);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node a1 = new Node(2);
        Node a2 = new Node(2);
        root.left = a1;
        root.right = a2;

        Node b1 = new Node(3);
        Node b2 = new Node(4);
        Node b3 = new Node(4);
        Node b4 = new Node(3);

        a1.left = b1;
        a1.right = b2;
        a2.left = b3;
        a2.right = b4;

        /*
              1
             / \
            2   2
           / \ / \
          3  4 4  3
        */
        boolean ans=symmetry(root);
        System.out.println(ans);
    }
}
