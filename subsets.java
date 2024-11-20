/*Subsets
Given an array nums of unique integers, return all possible subsets of nums.

The solution set must not contain duplicate subsets. You may return the solution in any order.

Example 1:

Input: nums = [1,2,3]

Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [7]

Output: [[],[7]]
Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
 */

 class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++) {
            int n=res.size();
            for(int j=0;j<n;j++) {
                List<Integer>subset=new ArrayList<>(res.get(j));
                subset.add(nums[i]);
                res.add(subset);
            }
        }
        return res;
    }
}

