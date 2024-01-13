/*qsn :

Given an array, return true if the array contains i,j,k such that arr[i] > arr[j] > arr[k] and j > i , k > j; 

example: 
arr : [ 1,2,3,8,76]
op : true 

arr :[1,2,3,4]
op: false.*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={1,1,2,0,3,7};
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<3)
    {
        printf("insufficent elements");
        return 0;
    }

    /*made three pointer and made loops in such 
    way that it  checks all posible wyas of i<j<k */
    // pointing i
    for(int i=0;i<size-2;i++)
    {
        // pointing j
        for(int j=i+1;j<size-1;j++)
        {
            // pointing k
            for(int k=j+1;k<size;k++)
            {
                if(nums[i]>nums[j]&&nums[j]>nums[k])
                {
                    printf("true");
                    return 0;
                }
            }
        }
    }
    printf("false");
    return 0;
}