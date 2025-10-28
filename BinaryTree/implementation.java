package BinaryTree;

import java.util.*;
public class implementation {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void display(Node root){
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ->");
        if (root.left!=null) {
            System.out.print("L:"+root.left.data);
        }
        if (root.right!=null) {
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        b.left=c;
        b.right=d;
        display(root);
    }
}
