import java.util.*;

import org.w3c.dom.Node;
public class balancedTree {
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
    public static class Info{
        int ht;
        boolean balanced;
        Info(int ht,boolean balanced){
            this.ht=ht;
            this.balanced=balanced;
        }
    }

    public static Info balacHeight(Node root){
        if (root==null) {
            return new Info(0, true);
        }
        Info leftInfo=balacHeight(root.left);
        Info rightInfo=balacHeight(root.right);
        int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
        boolean balanced=leftInfo.balanced && rightInfo.balanced && (Math.abs(leftInfo.ht - rightInfo.ht) <= 1);
        return new Info(ht, balanced);

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

        Info wer=balacHeight(root);
        System.out.println(wer.balanced);

    }
}
