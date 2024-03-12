//rotating array with function
#include<stdio.h>
#include<stdlib.h>
//TC=O(n)
void rotatearray(int arr1[], int size, int k)
{
    int arr2[size];
    int l=0;
    for( int i=size-k;i<size;i++)
    {
        arr2[l]=arr1[i];
        l++;
    }
    for(int m=0;m<size-k;m++)
    {
        arr2[l]=arr1[m];
        l++;
    }
    for( int f=0;f<size;f++)
    {
        printf("%d ",arr2[f]);
    }
}
int main()
{
    int arr1[]={1,2,3,4,5};
    int size=sizeof(arr1)/sizeof(arr1[0]);
    int k=100;
    if(size<=0)
    {
        printf("empty array");
        return 0;
    }
    if(k<size)
    {
        rotatearray( arr1,size,k);
        return 0;
    }
    if(k>size)
    {
        k=k%size;
        if(k==0)
        {
            for(int r=0;r<size;r++)
            {
                printf("%d ",arr1[r]);
            }
            return 0;
        }
        else
        {
            rotatearray(arr1,size,k);
            return 0;
        }
    }
}
//TIMECOMPLIXIXTY=O(n)