/*Subtree of a Binary Tree
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

Example 1:



Input: root = [1,2,3,4,5], subRoot = [2,4,5]

Output: true
Example 2:



Input: root = [1,2,3,4,5,null,null,6], subRoot = [2,4,5]

Output: false
Constraints:

0 <= The number of nodes in both trees <= 100.
-100 <= root.val, subRoot.val <= 100
 */

//CODE


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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(subRoot==null)
        {
            return true;
        }
        if(root == null)
        {
            return false;
        }
        if(samesub(root, subRoot))
        {
            return true;
        }
        return (isSubtree(root.left,subRoot) ||isSubtree(root.right,subRoot));
    }
    public boolean samesub(TreeNode root,TreeNode subRoot)
    {
        if(root==null &&subRoot==null)
        {
            return true;
        }
        if(root!=null&&subRoot!=null&&root.val==subRoot.val)
        {
            return  samesub(root.left, subRoot.left) && samesub(root.right, subRoot.right);
        }
        return false;
    }
}
