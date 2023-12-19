#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={1,2,3,-1,-2};
    int j=0,k=0,c=0,i=0,b=0,t=0;
    int size=sizeof(arr)/sizeof(arr[0]);
    int arr1[size]={};
    int arr2[size]={};
    if(size<=0)
    {
        printf("empty array");
    }
    else
    {
        for( i=0;i<size;i++)
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
        for( b=0;b<=k;b++)
        {
            arr[b]=arr1[c];
            c++;
        }
        for(int d=b;d<size;d++)
        {
            arr[d]=arr2[b];
            b++;
        }
        for(int z=0;z<size;z++)
        {
            printf("%d ",arr[z]);
        }
    }
    return 0;
}