import java.util.*;
public class deleteNode{
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
    public static Node inorderSucc(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node deletion(Node root,int key){
        if(root==null){
            return null;
        }
        if(root.data>key){
            root.left=deletion(root.left,key);
        }
        else if(root.data<key){
            root.right=deletion(root.right,key);
        }else{
            if(root.left==null && root.right==null){
            return null;      
            }
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //if there is two child of a node
            Node is=inorderSucc(root.right);
            root.data=is.data;
            root.right=deletion(root.right,is.data);
        }

        return root;
    }
    public static void main(String args[]){
         Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(7);
        root.left.left.left=new Node(1);
        root.right=new Node(9);
       deletion(root,7);
    } 
}