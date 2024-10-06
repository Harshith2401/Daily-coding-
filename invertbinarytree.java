/*Invert a Binary Tree
Solved 
You are given the root of a binary tree root. Invert the binary tree and return its root.

Example 1:



Input: root = [1,2,3,4,5,6,7]

Output: [1,3,2,7,6,5,4] */


/// CODE

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
     public TreeNode invertTree(TreeNode root) 
     {
         if (root == null) return null;
         
         TreeNode node = new TreeNode(root.val);

         node.right = invertTree(root.left);
         node.left = invertTree(root.right);
         
         return node;
     }
 }