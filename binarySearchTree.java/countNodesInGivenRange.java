import java.util.*;
public class countNodesInGivenRange{
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
   public static int getCount(Node root, int l, int h) {
        // Your code here
        int count=0;
        if(root==null){
            return 0;
        }
        
        if(root.data>=l && root.data<=h){
            count++;
        }
        
        if(h<root.data){
            return getCount(root.left,l,h);
        }
        if(l>root.data){
            return getCount(root.right,l,h);
        }
        
        return count+getCount(root.left,l,h)+ getCount(root.right,l,h);
        
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        root.left.left.left=new Node(1);
        root.right=new Node(9);
       System.out.println(getCount(root,2,9));
    }
}