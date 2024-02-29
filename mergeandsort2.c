#include<stdio.h>
#include<stdlib.h>
int main()
{
    int nums1[]={1,3,5};
    int nums2[]={2,6,8};
    int size1=sizeof(nums1)/sizeof(nums1[0]);
    int size2=sizeof(nums2)/sizeof(nums2[0]);
    if(size1==0 && size2==0)
    {
        printf("arr1 and arr2 are empty");
        return 0;
    }
    int size=size1+size2;
    int nums[size];
    int i=0,j=0,k=0;
    for(int m=0;m<size;m++)
    {
        if(nums1[i]<nums2[j])
        {
            nums[k]=nums1[i];
            i++;
            k++;
        }
        else
        {
            nums[k]=nums2[j];
            j++;
            k++;
        }
    }
    for(int i=0;i<size;i++)
    {
        printf("%d ",nums[i]);
    }
    return 0;
}