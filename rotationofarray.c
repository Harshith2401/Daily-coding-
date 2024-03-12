//rotation of the array
#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr1[]={1,2,3,4,5};
    int size=sizeof(arr1)/sizeof(arr1[0]);
    int k=13,l=0,z=0;
    int arr2[size];
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    if(k<size)
    {
        for(int i=size-k;i<size;i++) 
        {
            arr2[l]=arr1[i];     
            l++;
        }
        for(int m=0;m<size-k;m++)
        {
            arr2[l]=arr1[m];
            l++;
        }
        return 0;
    }
    if(k>size)
    {
        int r=k%size;
        if(r==0)
        {
            for(int m=0;m<size;m++)
            {
                printf("%d ",arr1[m]);
            }
            return 0;
        }
        if(r>0)
        {
            for(int f=size-r;f<size;f++)
            {
                arr2[z]=arr1[f];
                z++;
            }
            for(int y=0;y<size-r;y++)
            {
                arr2[z]=arr1[y];
                z++;
            }
            for(int a=0;a<size;a++)
            {
                printf("%d ",arr2[a]);
            }
            return 0;
        }
    }
    return 0;
}
//TIMECOMPLIXITY=O(n)