/*Binary Tree Level Order Traversal
Solved 
Given a binary tree root, return the level order traversal of it as a nested list, where each sublist contains the values of nodes at a particular level in the tree, from left to right.

Example 1:



Input: root = [1,2,3,4,5,6,7]

Output: [[1],[2,3],[4,5,6,7]]
Example 2:

Input: root = [1]

Output: [[1]]
Example 3:

Input: root = []

Output: []
Constraints:

0 <= The number of nodes in both trees <= 1000.
-1000 <= Node.val <= 1000
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        int h=height(root);
        for(int i=1;i<=h;i++)
        {
            List<Integer> levellist = new ArrayList<>();
            bfs(root,i,levellist);
            list.add(levellist);
        }
        return list;

        
    }
    int height(TreeNode root)
    {
        if(root!=null)
        {
            return 1 + Math.max(height(root.left),height(root.right));
        }
        return 0;
    }
    void bfs(TreeNode root,int level,List<Integer>levellist)
    {
        if(root==null) return ;
        if(level==1)
        {
            levellist.add(root.val);
        }
        bfs(root.left,level-1,levellist);
        bfs(root.right,level-1,levellist);
    }
}

//Time complexcity=O(n);
