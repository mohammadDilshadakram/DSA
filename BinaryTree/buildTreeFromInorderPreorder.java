import java.util.*;

import org.w3c.dom.Node;
public class buildTreeFromInorderPreorder {
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
    public static Node helper(int[] preorder,int pl,int ph, int[] inorder,int il,int ih){
        if(pl>ph || il>ih){
            return null;
        }
        Node root=new Node(preorder[pl]);
        int i=il;
        while(inorder[i]!=preorder[pl]){
            i++;
        }
        int size=i-il;
        root.left=helper(preorder,pl+1,pl+size,inorder,il,i-1);
        root.right =helper(preorder,pl+size+1,ph,inorder,i+1,ih);
        return root;
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
            //2   3
            //     / \
            //     4   5
        int[] preorder={1,2,3,4,5};
        int[] inorder={2,1,4,3,5};
        int n=preorder.length;
         helper(preorder,0,n-1,inorder,0,n-1);
    }
}