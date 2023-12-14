// finding absolute sum of array
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int sum=0;
	int arr[]={1,-1,2,-2};
	int size=sizeof(arr)/sizeof(arr[0]);
	if(size<0)
	{
		printf("empty array");
	}
	for(int i=0;i<size;i++)
	{
		if(arr[i]<=0)
		{
			arr[i]=arr[i]*-1;
		}
		sum+=arr[i];
	}
	printf("%d",sum);
	return 0;
}