package BinaryTree;

import java.util.*;


public class countSumHeightMax {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = right;
        }
    }

    public static int count(Node root){
        if (root==null) {
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }

    public static int sum(Node root){
        if (root==null) {
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
    public static int height(Node root){
        if (root==null) {
           return 0; 
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int max(Node root){
        if (root==null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
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
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(height(root));
        System.out.println(max(root));
        
    }
}
