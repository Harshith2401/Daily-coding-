/*530. Minimum Absolute Difference in BST
Solved
Easy
Topics
Companies
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

 

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 

Constraints:

The number of nodes in the tree is in the range [2, 104].
0 <= Node.val <= 105
 

Note: This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/


Seen this question in a real interview before?
1/5
Yes
No
Accepted
498.2K
Submissions
848.4K
Acceptance Rate
58.7%
Topics
Companies
Similar Questions
Discussion (73)

Choose a type



Copyright ©️ 2025 LeetCode All rights reserved */

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
    private static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        if (list.size() < 2) return -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            min = Math.min(min, Math.abs(list.get(i) - list.get(i + 1)));
        }
        return min;
    }
}