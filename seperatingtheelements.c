#include<stdio.h>
#include<stdlib.h>
int main() 
{
    int arr[]={1,6,-1,5,-7};
    int size=sizeof(arr)/sizeof(arr[0]);
    
    if(size<=0) 
    {
        printf("Empty array");
    } else
    {
        int arr1[size]; 
        int arr2[size];
        int j=0,k=0;
        for(int i=0;i<size;i++) 
        {
            if(arr[i]<0) 
            {
                arr1[j]=arr[i];
                j++;
            }
            else
            {
                arr2[k]=arr[i];
                k++;
            }
        }
        for(int b=0;b<j;b++) 
        {
            arr[b]=arr1[b];
        }
        for(int d=0;d<k;d++) 
        {
            arr[j+d]=arr2[d];
        }
        for(int z=0;z<size;z++) 
        {
            printf("%d ",arr[z]);
        }
    }
    return 0;
}
