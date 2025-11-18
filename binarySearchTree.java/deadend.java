import java.util.*;
public class deadend{
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
    public static boolean isFound(Node root,int val){
        
        if (val<=0) {
            return true;
        }
        if (root==null) {
            return false;
        }
        if (val==root.data) {
            return true;
        }
        if (val<root.data) {
            return isFound(root.left, val);
        }else{
            return isFound(root.right, val);
        }
    }
    public static boolean isDeadEnd(Node curr,Node root){
        if (curr==null) {
            return false;
        }
        if (curr.left==null && curr.right==null) {
            return isFound(root, root.data-1) && isFound(root, root.data+1);
        }
        return isDeadEnd(curr.left,root) || isDeadEnd(curr.right,root);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        root.left.left.left=new Node(1);
        root.right=new Node(9);
        if (isDeadEnd(root,root)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
