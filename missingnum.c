#include<stdio.h>
#include<stdlib.h>
int main()
{
    int arr[]={1,2,4,5};
    int size=sizeof(arr)/sizeof(arr[0]);
    if(size<=0)
        return 0;
    int n=size+1;
    int tsum=0,sum=0;
    for(int j=1;j<=n;j++)
    {
        tsum=tsum+j;
    }
    for(int i=0;i<size;i++)
    {
        sum=sum+arr[i];
    }
    printf("%d",tsum-sum);
    return 0;
}