//insertion sort and binary.
#include<stdio.h>
#include<stdlib.h>
int binary_search(int nums[],int size,int target);
void insertion_sort(int nums[],int size);
int main()
{
    int nums[]={1,2,9,75,5,6};
    int target=5;
    int size=sizeof(nums)/sizeof(nums[0]);
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    insertion_sort(nums,size);

    // assiging binary search result to result
    int result=binary_search(nums,size,target);
    if(result!=-1)
    {
        printf("true");
    }
    else{
        printf("false ");
    }
    return 0;
}

// binary search function
//TC=O(logn)
int binary_search(int nums[],int size,int target)
{
    int low=0,high=size-1;
    int f=-1;


    while(low<=high)//TC=O(logn)
    {
        int mid=(low+high)/2;// finding mid.
        int midvalue=nums[mid];
        if(midvalue==target)
        {
            return mid;
        }

        // updating low and high accordingly.
        else if(midvalue<target)
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }    
    }
    return -1;
}

// insertion sort.
//TC=O(n^2)
void insertion_sort(int nums[],int size)
{
    for(int i=1;i<size;i++)//TC=O(n)
    {
        // assigning of the key value to be inserted in correct postion.
        int k=nums[i];
        int j=i-1;

        // move all greater elements to one position ahed.
        while(j>=0&&nums[j]>k)//TC=O(N)
        {
            nums[j+1]=nums[j];
            j--;
        }

        // place the key element in  its right position.
        nums[j+1]=k;
    }
}
//TIMECOMPLEXITY==O(n^2)+O(logn)===O(n^2)