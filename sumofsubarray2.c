/*Qsn) Given an array , find if there's a sub array of size any thing with sum of elements = 15. Return true or false. 

Eg: A = [ 1,-1, 4, 5, 6, 7, -5] 
Output: true 

Explanation : [ 4,5,6] subarray has sum 15*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={0,0,0};
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    int k=5;

    // outer loop is responsible for start index.
    for(int i=0;i<size;i++)
    {
        int sum=0;

        // inner loop is responsible for end index
        for(int j=i;j<size;j++)

        {
            sum+=nums[j];
            if(sum==k)
            {
                printf("true");
                return 0;
            }
        }
       
    }
    printf("false");
    return 0;
}