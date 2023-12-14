#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[]={1,2,3};
	int size=sizeof(arr)/sizeof(arr[0]);
	if(size<0)
	{
		printf("empty array");
	}
	else
	{
		int i,j;
		for(i=0;j=size-1;i++,j--)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		for(i=0;i<size;i++)
		{
			printf("%d ",arr[i]);
		}
	}
	return 0;
}