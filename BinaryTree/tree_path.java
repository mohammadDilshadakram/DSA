import java.util.*;
//     what i want you to do is solve/do this assessment for me as directed in the pdf and in the last tell me steps to run the project and also mention file structure so copied things accordingly
// if possible use mern JavaScript for my feasibility 
// kindly do all task mention in the pdf

public class tree_path {
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
public static void printPath(Node root,ArrayList<String> ans,String s){
    if (root==null) {
        return;
    }
    if (root.right==null && root.left==null) {
        s+=root.data;
        ans.add(s);
        s="";
        return;
    }
    printPath(root.left, ans, s+root.data);
    printPath(root.right, ans, s+root.data);
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

        ArrayList<String> ans=new ArrayList<>();
        printPath(root, ans, "");
        System.out.println(ans);
    }
}
