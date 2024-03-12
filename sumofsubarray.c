/*Qsn) Given an array greater than size 3, find if there's a sub array of size 3 with sum of elements = 15. Return true or false. 

Eg: A = [ 1,-1, 4, 5, 6, 7, -5] 
Output: true 

Explanation : [ 4,5,6] subarray has sum 15*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={1,-1,4,5,6,7,-5};
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<3)
    {
        printf("exited");
        return 0;
    }
    for(int i=0;i<=size-3;i++)
    {
        int sum=nums[i]+nums[i+1]+nums[i+2];
        if(sum==15)
        {
            printf("true");
            return 0;
        }
    }
    printf("false");
    return 0;

}
//TIMECOMPLIXIXTY=O(n)