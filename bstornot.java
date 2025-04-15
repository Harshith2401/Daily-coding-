class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class bstcheck {

    public static boolean isBinaryTree(Node node) {
        if (node == null) return true;
        if (countChildren(node) > 2) return false;
        return isBinaryTree(node.left) && isBinaryTree(node.right);
    }

    public static int countChildren(Node node) {
        int count = 0;
        if (node.left != null) count++;
        if (node.right != null) count++;
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isBinaryTree(root)) {
            System.out.println(" binary tree");
        } else {
            System.out.println("not binary tree");
        }
    }
}