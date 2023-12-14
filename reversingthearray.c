// reversing the array.
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[]={1,5,6,9,85,14,5};
	int b;
	int temp=0,i,k=1;
	int size=sizeof(arr)/sizeof(arr[0]);
	if(size<=0)
	{
		printf("empty array");
	}
	for(i=0;i<size;i++)
	{
		b=arr[size-k];
		arr[size-k]=arr[i];
		arr[i]=b;
		k++;
		if (k>size/2)
	    break;
	}
	for(i=0;i<size;i++)
	{
		printf("%d ",arr[i]);
	}
	return 0;
}