import java.util.*;

class bst_to_balance_bst {
    public static class Node {
        int data;
        Node right, left;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void getInOrder(Node root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }
        getInOrder(root.left, al);
        al.add(root.data);
        getInOrder(root.right, al);
    }

    public static Node create(ArrayList<Integer> al, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(al.get(mid));
        root.left = create(al, si, mid - 1);
        root.right = create(al, mid + 1, ei);
        return root;

    }

    public static Node balanceBST(Node root) {
        // Add your code here.
        ArrayList<Integer> al = new ArrayList<>();
        getInOrder(root, al);
        return create(al, 0, al.size() - 1);
    }

    public static void main(String args[]) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.left.left.left = new Node(1);
        root.right = new Node(9);
        balanceBST(root);
    }
}