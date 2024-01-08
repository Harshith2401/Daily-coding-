#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={0,0,0};
    int size=sizeof(nums)/sizeof(nums[0]);
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