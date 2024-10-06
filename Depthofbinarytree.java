/*Depth of Binary Tree
Solved 
Given the root of a binary tree, return its depth.

The depth of a binary tree is defined as the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:



Input: root = [1,2,3,null,null,4]

Output: 3 */

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
//using dfs algo to solve this.
public class Solution 
{
     public int maxDepth(TreeNode root) 
     {
         Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
         stack.push(new Pair<>(root, 1));
         int res = 0;// this will store the maximum depth in the traversl

         while (!stack.isEmpty()) 
         {
             Pair<TreeNode, Integer> current = stack.pop();
             TreeNode node = current.getKey();
             int depth = current.getValue();

             if (node != null) 
             {
                 res = Math.max(res, depth);// this will aign the maximum depth
                 stack.push(new Pair<>(node.left, depth + 1));// depth+1 is because the child is one level down
                 stack.push(new Pair<>(node.right, depth + 1));
             }
         }
         return res;
     }
 }