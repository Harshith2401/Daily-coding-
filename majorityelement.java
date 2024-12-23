/*169. Majority Element
Solved
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109 */
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int result=0;
        int majority=0;
        for (int n : nums) 
        {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n)>majority) 
            {
                res=n;
                majority=hash.get(n);
            }
        }
        return result;        
    }
}
//Since the problem guarantees the existence of a majority element, the element that 
//exceeds n/2 occurrences will inevitably have the highest frequency 
//in the map. Thus, n/2 is inherently checked by the hash. 
//

get(n) > majority condition as the loop progresses.