import java.util.*;

public class largest_bst_in_bt {
    public static class Node {
        int data;
        Node right, left;
        Node(int data) {
            data = data;
            left = right = null;
        }
    }

    public static class Info{
        int min;
        int max;
        int size;
        Info(int min,int max,int size){
            this.min=min;
            this.max=max;
            this.size=size;

        }
    }

   public static Info maxBst(Node root){
    if (root==null) {
        return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }
    Info left=maxBst(root.left);
    Info right=maxBst(root.right);
    if (root.data>left.max && root.data<right.min) {
        int currMin=Math.min(root.data, left.min);
        int currMax=Math.max(root.data, right.max);
        int size=left.size+right.size+1;
        return new Info(currMin, currMax, size);
    }
    else{
        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.size, right.size));
    }
   }


    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.left.left.left = new Node(1);
        root.right = new Node(9);
        Info info=maxBst(root);
        System.out.println(info.size);
    }
}
