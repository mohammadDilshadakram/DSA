import java.util.*;
public class subPart_of_a_root {
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
    public static boolean isIdentical(Node root,Node root2){
        if (root==null && root2==null) {
            return true;
        }
        if (root==null || root2==null) {
            return false;
        }
        if ( root.data!=root2.data) {
            return false;
        }
        if (!isIdentical(root.left, root2.left)) {
            return false;
        }
        if (!isIdentical(root.right, root2.right)) {
            return false;
        }
        return true;
    }
    public static boolean isSame(Node root,Node root2){
        if (root==null) {
            return false;
        }
        if (root2==null) {
            return false;
        }
        if (root.data==root2.data) {
            if (isIdentical(root,root2)) {
                return true;
            }
                      
        }
        return isSame(root.left, root2) || isSame(root.right, root2);

    }
    public static void main(String[] args){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        b.left = c;
        b.right = d;
        Node root2=new Node(3);
        root2.left=new Node(4);
        root2.right=new Node(5);
            //  1
            // / \
            // 2   3
            //     / \
            //     4   5

            System.out.println(isSame(root, root2));
    }
}
