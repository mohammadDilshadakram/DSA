import java.util.*;
public class transform_into_sum_tree {
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

    public static int transform(Node root){
        if (root==null) {
            return 0;
        }
        int left=transform(root.left);
        int right=transform(root.right);
        int newLeft,newRight;
        if (root.left==null) {
            newLeft=0;
        }else{
            newLeft=root.left.data;
        }

         if (root.right==null) {
            newRight=0;
        }else{
            newRight=root.right.data;
        }
        int data=root.data;
        root.data=left+right+newLeft+newRight;

        return data;

    }

    public static void preorder(Node root){
        if (root==null) {
            return;
        }
        System.out.println(root.data);
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

        preorder(root);
        System.out.println("--------------X--------------");
        transform(root);
        preorder(root);
    }
}
