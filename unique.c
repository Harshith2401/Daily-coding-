/*Given a sorted array A of size n and a number k, return the number of unique pairs which have a difference of k.
|arr[i] - arr[j]| = k where i < j
A: [1, 3, 5, 7, 10]
k: 2
Answer: 3*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int size=5;
    int count=0;
    int nums[]={1,3,5,7,10};
    int k=2;
    if(size==0)
    {
        printf("empty array");
        return 0;
    }
    for(int i=0;i<size-1;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if((nums[i]-nums[j])*-1==k)
            {
                count++;
            }
        }
    }
    printf("%d",count);
    return 0;
}
//TIMECOMPLEXICITY=O(n^2)