
import java.util.*;



public class level_order_traversal {
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

    public static void lot(Node root,Queue<Integer>q){
        if (root==null) {
            return;
        }
        q.add(root.data);
        System.out.print(q.poll());
        
        lot(root.left,q);
        lot(root.right,q);
        


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
        Queue<Integer> q=new LinkedList<>();
        lot(root, q);
        
    }
}
