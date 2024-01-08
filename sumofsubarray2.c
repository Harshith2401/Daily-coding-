#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={-1,-2,-5,5,9,40,5};
    int size=sizeof(nums)/sizeof(nums[0]);
    int k=0;
    for(int start=0;start<size;start++)
    {
        int sum=0;
        for(int end=start;end<size;end++)
        {
            sum+=nums[end];
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