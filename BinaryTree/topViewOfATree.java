import java.util.*;
    
public class topViewOfATree {
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
        Node root;
        int hd;
        Info(Node root,int hd){
            this.root=root;
            this.hd=hd;
        }
    }
    public static void topViewOfATree(Node root){
        if (root==null) {
            return;
        }
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        q.add(new Info(root,0));
        q.add(null);
        int min=0;
        int max=0;

        while (!q.isEmpty()) {
            Info curr=q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    
                    q.add(null);
                    
                }
            }else{
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.root);
                    
                }
                if (curr.root.right!=null) {
                    q.add(new Info(curr.root.right, curr.hd+1));
                    max=Math.max(max, curr.hd+1);
                }
                if (curr.root.left!=null) {
                    q.add(new Info(curr.root.left, curr.hd-1));
                    
                    min=Math.min(min, curr.hd-1);   
                }
            }
        }
        for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data);
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
            //2   3
            //     / \
            //     4   5
        topViewOfATree(root);
        
    }
}
