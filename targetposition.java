/*35.SEARCH INSERT POSITION.
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                k=i;
                break;
            }
            else if(i==nums.length-1)
            {
                k=i+1;
                break;
            }

        }
        return k;
    }
}
//TIME COMPLEXCITY=O(n)