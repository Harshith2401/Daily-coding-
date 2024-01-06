/*Today's qsn:
Remove the given element from an array. 

input arr - [ 1,2,3,4,4,4,5,6,4]
k= 4

result array :[1,2,3,5,6,-1,-1,-1,-1] 

new size of array = 5*/
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums[]={2,2,2};
    int size=sizeof(nums)/sizeof(nums[0]);

    // empty array condition.
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    int end=size-1;
    int k=2;

    // using end insted of size to reduse time.
    for(int i=0;i<=end;)
    {
        if(nums[i]==k)
        {
            // marking the k value and swaping with last numbers
            nums[i]=-1;
            int temp=nums[end];
            nums[end]=nums[i];
            nums[i]=temp;
            end--;
        }
        else
        {
            /*if the k value lies in last index then after swaping ,
            it should not be incremented cauuse the current element
            after swaping also should be changed so increment is in else block*/
            i++;
        }
    }

    // printing.
    for(int i=0;i<size;i++)
    {
        printf("%d ",nums[i]);
    }
    printf("\n new size of array is %d",end+1);
    return 0;
}