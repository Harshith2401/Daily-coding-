import java.util.*;

class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
    }
}

public class Spiral2 {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insertRec(root.left, data);
        else root.right = insertRec(root.right, data);
        return root;
    }

    public void spiralTraversal(Node root) {
        if (root == null) return;

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        boolean leftToRight = false;

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = deque.poll();
                level.add(node.data);
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }

            if (leftToRight) Collections.reverse(level);
            for (int val : level) System.out.print(val + " ");
            System.out.println();

            leftToRight = !leftToRight;
        }
    }

    public static void main(String[] args) {
        SpiralEfficient tree = new SpiralEfficient();
        int[] values = {25, 15, 35, 10, 20, 30, 40, 5, 12};
        for (int val : values) tree.insert(val);

        tree.spiralTraversal(tree.root);
    }
}
