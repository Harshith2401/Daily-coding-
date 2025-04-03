/*993. Cousins in Binary Tree
Easy
Topics
Companies
Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.

Two nodes of a binary tree are cousins if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.

 

Example 1:


Input: root = [1,2,3,4], x = 4, y = 3
Output: false
Example 2:


Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true
Example 3:


Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false
 

Constraints:

The number of nodes in the tree is in the range [2, 100].
1 <= Node.val <= 100
Each node has a unique value.
x != y
x and y are exist in the tree. */
class Solution {
    int findDepth(TreeNode root, int key, int depth) {
        if (root == null) return -1;
        if (root.val == key) return depth; 

        int leftDepth = findDepth(root.left, key, depth + 1);
        if (leftDepth != -1) return leftDepth;

        return findDepth(root.right, key, depth + 1);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        int depthX = findDepth(root, x, 0);
        int depthY = findDepth(root, y, 0);

        if (depthX != depthY) return false;

        return !areSiblings(root, x, y);
    }
    boolean areSiblings(TreeNode root, int x, int y) {
        if (root == null) return false;

        if (root.left != null && root.right != null) {
            if ((root.left.val == x && root.right.val == y) ||
                (root.left.val == y && root.right.val == x)) {
                return true;
            }
        }
        return areSiblings(root.left, x, y) || areSiblings(root.right, x, y);
    }
}
// sybling nodes with same parent .
//cousin node with different parent.