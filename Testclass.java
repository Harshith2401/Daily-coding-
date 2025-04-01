/*Create a Binary Search Tree from list A containing N elements. Insert elements in the same order as given. Print the pre-order traversal 
of the subtree with root node data equal to Q (inclusive of Q), separating each element by a space.

Input:
First line contains a single integer N – number of elements.
Second line contains N space-separated integers.
Third line contains a single integer Q – the element whose subtree is to be printed in pre-order form.

Output:
Print K space-separated integers – where K is the number of elements in the subtree of Q (inclusive of Q)

Constraints:



SAMPLE INPUT 
4
2 1 3 4
3
SAMPLE OUTPUT 
3
4 */
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BST {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public Node find(Node root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (data < root.data) {
            return find(root.left, data);
        }
        return find(root.right, data);
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
}

public class Testclass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BST bst = new BST();
        for (int i = 0; i < N; i++) {
            bst.insert(sc.nextInt());
        }
        int Q = sc.nextInt();
        Node subtreeRoot = bst.find(bst.root, Q);
        if (subtreeRoot != null) {
            bst.preorder(subtreeRoot);
        }
        sc.close();
    }
}
