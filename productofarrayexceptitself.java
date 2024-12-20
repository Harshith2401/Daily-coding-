/*238. Product of Array Except Self
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis. */

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int count0 = 0, prod = 1;
        for(int num: nums){
            if(num == 0){
                count0++;
                if(count0 >=2) return new int[nums.length];
                continue;
            }
            prod *= num;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                ans = new int[nums.length];
                ans[i] = prod;
                return ans;
            }
            ans[i] = prod/nums[i]; 
        }
        return ans;
    }
}