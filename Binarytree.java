class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Binarytree {
    Node root;

    Binarytree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        Binarytree b = new Binarytree();
        b.insert(50);
        b.insert(30);
        b.insert(20);
        b.insert(40);
        b.insert(70);
        b.insert(60);
        b.insert(80);

        System.out.println("Preorder");
        b.preorder(b.root);
        
        System.out.println("\nInorder ");
        b.inorder(b.root);
        
        System.out.println("\nPostorder ");
        b.postorder(b.root);
    }
}
