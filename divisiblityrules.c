#include<stdio.h>
#include<stdlib.h>
int main()
{   
    int nums[]={1,5,6,4,7,8,9,3};
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    int count2=0,count3=0,count5=0,count7=0;
    for(int i=0;i<size;i++)
    {
        if(nums[i]%2==0)
        {
            count2++;
        }
        if(nums[i]%3==0)
        {
            count3++;
        }
        if(nums[i]%5==0)
        {
            count5++;
        }
        if(nums[i]%7==0)
        {
            count7++;
        }
    }
    printf("divisible by 2=%d\n",count2);
    printf("divisible by 3=%d\n",count3);
    printf("divisible by 5=%d\n",count5);
    printf("divisible by 7=%d\n",count7);
    return 0;
}