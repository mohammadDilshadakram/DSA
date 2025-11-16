import java.util.*;
public class create {
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
    public static Node creation(Node root,int val){
        if (root==null) {
            return new Node(val);
        }
        if (root.data>val) {
            root.left=creation(root.left, val);
        }else{
            root.right=creation(root.right, val);
        }
        return root;
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
        int arr[]={2,3,1,4,5,8,9,0,7};
        Node root=new Node(14);
        for (int i = 0; i < arr.length; i++) {
            root=creation(root, arr[i]);
        }
        display(root);
    }
}
