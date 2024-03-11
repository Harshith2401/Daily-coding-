/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.


Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.*/
#include<stdio.h.>
#include<stdlib.h>
#include<limits.h>
int main ()
{
    int nums[]={1,2,3,8,5,9,6};
    int size=sizeof(nums)/sizeof(nums[0]);

    // giving first and second min values as int max.
    int f=INT_MAX,s=INT_MAX;
    if(size<3)
    {
        printf("insufficent");
        return 0;
    }
    //TC=O(n)
    for(int i=0;i<size;i++)//TC=O(n)
    {
        // knowing the first min
        if(nums[i]<=f)
        {
            f=nums[i];
        }

        // knowing the second min
        else if(nums[i]<=s)
        {
            s=nums[i];
        }
        else{
            printf("true");
            return 0;
        }
    }
    printf("false");
    return 0;
}
//TIMECOMPLIXIXTY=O(n)