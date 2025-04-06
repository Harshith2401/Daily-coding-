/*Count Good Nodes in Binary Tree
Solved 
Within a binary tree, a node x is considered good if the path from the root of the tree to the node x contains no nodes with a value greater than the value of node x

Given the root of a binary tree root, return the number of good nodes within the tree.

Example 1:



Input: root = [2,1,1,3,null,1,5]

Output: 3


Example 2:

Input: root = [1,2,-1,3,4]

Output: 4
Constraints:

1 <= number of nodes in the tree <= 100
-100 <= Node.val <= 100
 */

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        int key=root.val;
        inorder(root,key);
        return count;
    }
    void inorder(TreeNode root,int key)
    {
        if(root!=null)
        {
            if(root.val>=key)
            {
                count++;
                key=root.val;
            }
            inorder(root.left,key);
            inorder(root.right,key);
        }
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        int key=root.val;
        inorder(root,key);
        return count;
    }
    void inorder(TreeNode root,int key)
    {
        if(root!=null)
        {
            if(root.val>=key)
            {
                count++;
                key=root.val;
            }
            inorder(root.left,key);
            inorder(root.right,key);
        }
    }
}
