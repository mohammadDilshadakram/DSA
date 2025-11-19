import java.util.*;
public class isValidBst{
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static boolean isBst(Node root, int min,int max){
         if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        return isBst(root.left,min,root.data) && isBst(root.right,root.data,max);
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        root.left.left.left=new Node(1);
        root.right=new Node(9);
        if (isBst(root,1,Integer.MAX_VALUE)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}