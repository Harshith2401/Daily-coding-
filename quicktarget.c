#include<stdio.h>
#include<stdlib.h>

// funtion to perform quick sort on array
void quicksort(int nums[],int low,int high);
int main()
{
    int nums[]={1,6,2,6,89,};
    int target=6;
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    
    //calling quicksort function.
    quicksort(nums,0,size-1);
    int found=0;
    for(int i=0;i<size;i++)
    {
        if(nums[i]==target)
        {
            found=1;
            printf("%d ",i);
        }
    }
    if(!found)
    {
        printf("%d is not there in array",target);
    }
    return 0;
}

// function defination of qucik sort.
void quicksort(int nums[],int low,int high)
{
    int pivot,a,z,temp;

    // checking if there are more than one element in the array.
    if(low<high)
    {
        pivot=low;
        a=low;
        z=high;

        //partion of the array.
        while(a<=z)
        {
            while(nums[a]<=nums[pivot])
            {
                a++;
            }
            while(nums[z]>nums[pivot])
            {
                z--;
            }
            if (a<z)
            {
                temp=nums[a];
                nums[a]=nums[z];
                nums[z]=temp;
                pivot=z;
            }
        }
        temp=nums[pivot];
        nums[pivot]=nums[z];
        nums[z]=temp;

        //recursively sort the sub arrays.
        quicksort(nums,low,z-1);
        quicksort(nums,z+1,high);
    }
}
//quick sot take O(n^2) time in worst case.
//unable to break down and soleve but the tiemcomliixty is O(n^2) cause quick sort os involved.

