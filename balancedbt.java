/*Balanced Binary Tree
Solved 
Given a binary tree, return true if it is height-balanced and false otherwise.

A height-balanced binary tree is defined as a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

Example 1:



Input: root = [1,2,3,null,null,4]

Output: true
Example 2:



Input: root = [1,2,3,null,null,4,null,5]

Output: false
Example 3:

Input: root = []

Output: true
Constraints:

The number of nodes in the tree is in the range [0, 1000].
-1000 <= Node.val <= 1000
 */

 //code


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

class Solution 
{
    public boolean isBalanced(TreeNode root) 
    {
        int lheight=0,rheight=0;
        return dfs(root)!=-1;
    }
    private int dfs(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lheight=dfs(root.left);
        int rheight=dfs(root.right);
        if(lheight==-1||rheight==-1 )
        {
            return -1;
        }
        if(Math.abs(lheight-rheight)>1)
        {
            return -1;
        }
        return 1+Math.max(lheight,rheight);
    }
}

