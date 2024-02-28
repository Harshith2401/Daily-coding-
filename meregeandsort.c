#include<stdio.h>
#include<stdlib.h>
void insertion_sort(int nums[],int size);
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

    //meriging the first array.
    if(size1!=0)
    {
        for(int i=0;i<size1;i++)
        {
            nums[i]=nums1[i];
        }
    }

    // merging the second array.
    if(size2!=0)
    {
        for(int i=0;i<size2;i++)
        {
            nums[size1+i]=nums2[i];
        }
    }
    insertion_sort(nums,size);
    for(int i=0;i<size;i++)
    {
        printf("%d ",nums[i]);
    }
}

// inserstion sort for sorting the merged array
void insertion_sort(int nums[],int size)
{
    for(int i=1;i<size;i++)
    {
        // assigning of the key value to be inserted in correct postion.
        int k=nums[i];
        int j=i-1;

        // move all greater elements to one position ahed.
        while(j>=0&&nums[j]>k)
        {
            nums[j+1]=nums[j];
            j--;
        }

        // place the key element in  its right position.
        nums[j+1]=k;
    }
}

/*IMPORTANT LEARNINGS 
    WHAT IF THE ARRAYS ARE VERY BIG ? THE LOOP RUNS FOR  MANY TIMES.
      memcpy - this function will copy the blocks of memory from source 
                destination.
                
                mercpy(destination,source,sizeof(source))*/