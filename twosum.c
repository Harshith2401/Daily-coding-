/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

int* twoSum(int* nums, int numsSize, int target, int* returnSize){

    *returnSize =2;
    int* retNums = (int*)malloc(sizeof(int)*2);
    int i=0, j=0, temp=0;
    for (int i=0; i< numsSize; i++)
    {
        temp = target - nums[i];
        for (int j=i+1; j< numsSize; j++)
        {
            if(temp == nums[j])
            {
                retNums[0] = i;
                retNums[1] = j;
                return retNums;
            }
        }
    }
    return retNums;

}