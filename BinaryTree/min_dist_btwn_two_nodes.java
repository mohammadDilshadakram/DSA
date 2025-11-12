import java.util.*; 
public class min_dist_btwn_two_nodes {
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
    public static Node lca1(Node root,int a,int b){
          if (root==null) {
            return null;
        }
        if(root.data==a || root.data==b) {
            return root;
        }
      
        Node leftLca=lca1(root.left,a,b);
        Node rightLca=lca1(root.right,a,b);
        if (rightLca!=null && leftLca!=null) {
            return root;
        }
        if (leftLca==null) {
            return rightLca;
        }else{
            return leftLca;
        }

        
    }
    public static int dist(Node root,int a,int b){
        if (root==null) {
            System.out.println("dist");
            return -1;
        }
        Node lca=lca1(root,a,b);
        int dist1=lcaDist(lca,a);
        int dist2=lcaDist(lca,b);

        return dist1+dist2;
        
    }
    public static int lcaDist(Node root,int a){
        if (root==null) {
            System.out.println("lcadist");
            return -1;
        }
        if (root.data==a) {
            return 0;
        }
        int leftDist=lcaDist(root.left, a);
        int rightDist=lcaDist(root.right, a);
        if (leftDist==-1 && rightDist==-1) {
            return -1;
        }
        if (leftDist==-1) {
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
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

    int ser=dist(root, 2, 5);
    System.out.println(ser);
        
    }
}
