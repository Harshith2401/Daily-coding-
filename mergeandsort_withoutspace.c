
/*sorting of given 2 arrays when the arrays are already sorted without using extraspace
example: 
a1 = 2,5,8
a2 = 1,3,9, 10

result
a1 = 123
a2 = 589 10
or
 a2 = 1235
a1 = 8 9 10*/
#include<stdio.h>
#include<stdlib.h>
void insertion_sort(int nums[],int size);
int main()
{
    int nums1[]={1};
    int nums[]={2};
    int size1=sizeof(nums1)/sizeof(nums1[0]);
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size1==0 && size==0)
    {
        printf("arr1 and arr2 are empty");
        return 0;
    }
    int temp,i=0,j=0;

    // sorting the nums1 by swaping technique.
    //TC=O(min(size1,size)*size^2)
    while(i<size1&&j<size)//TC=O(min(size1,size))
    {
        if(nums1[i]>nums[j])
        {
            temp=nums1[i];
            nums1[i]=nums[j];
            nums[j]=temp;
            insertion_sort(nums,size);//TC=O(n^2)// for every swap sorting the second array by inserstion sort.
        }
        i++;
    }
    for(int k=0;k<size1;k++)
    {
        printf("%d ",nums1[k]);
    }
    for(int k=0;k<size;k++)
    {
        printf("%d ",nums[k]);
    }
    return 0;
}
//TC=O(n^2)
void insertion_sort(int nums[],int size)
{
    for(int i=1;i<size;i++)//TC=O(n)
    {
        // assigning of the key value to be inserted in correct postion.
        int k=nums[i];
        int j=i-1;

        // move all greater elements to one position ahed.
        while(j>=0&&nums[j]>k)//TC=O(n)
        {
            nums[j+1]=nums[j];
            j--;
        }

        // place the key element in  its right position.
        nums[j+1]=k;
    }
}
//TIMECOMPLEXITY=O(min(size1,size)*size^2)
