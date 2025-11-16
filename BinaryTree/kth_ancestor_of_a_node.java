import java.util.*;
public class kth_ancestor_of_a_node {

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
    public static int ancestor(Node root,int k,int n){
        if (root==null) {
            return -1;
        }
        if (root.data==n) {
            return 0;
        }
        int left=ancestor(root.left, k, n);
        int right=ancestor(root.right, k, n);
        if (left==-1 && right==-1) {
            return -1;
            
        }

        int max=Math.max(left, right);
        if (max+1==k) {
            return root.data;
        }

        return max+1;
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

        System.out.println(ancestor(root,2, 4));

    }
}
