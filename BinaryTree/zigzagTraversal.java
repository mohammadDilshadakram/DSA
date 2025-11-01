import java.util.*;
public class zigzagTraversal {
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
    public static int height(Node root){
        if (root==null) {
           return 0; 
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void leveth(Node root,int l){
        if (root==null) {
            return;
        }
        if (l==1) {
            System.out.print(root.data+" ");
        }
        leveth(root.left, l-1);
        leveth(root.right, l-1);
    }
     public static void leveth2(Node root,int l){
        if (root==null) {
            return;
        }
        if (l==1) {
            System.out.print(root.data+" ");
        }
        
        leveth2(root.right, l-1);
        leveth2(root.left, l-1);
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
        int level=height(root);
        for (int i = 1; i <= level; i++) {
            if (i%2!=0) {
                leveth(root,i);
            }else{
                leveth2(root,i);
            }
            
        }  
    }
}
